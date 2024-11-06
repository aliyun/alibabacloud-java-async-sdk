// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnUserRealTimeDeliveryFieldResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserRealTimeDeliveryFieldResponseBody</p>
 */
public class DescribeDcdnUserRealTimeDeliveryFieldResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnUserRealTimeDeliveryFieldResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserRealTimeDeliveryFieldResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3EACD23C-F49F-4BF7-B9AD-C2CD3BA888C4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnUserRealTimeDeliveryFieldResponseBody build() {
            return new DescribeDcdnUserRealTimeDeliveryFieldResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnUserRealTimeDeliveryFieldResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserRealTimeDeliveryFieldResponseBody</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private Fields(Builder builder) {
            this.description = builder.description;
            this.fieldName = builder.fieldName;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String description; 
            private String fieldName; 
            private Boolean selected; 

            /**
             * <p>The description of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>The timestamp of the request</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>unixtime</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>Indicates whether the field was selected.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnUserRealTimeDeliveryFieldResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserRealTimeDeliveryFieldResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.List < Fields> fields;

        private Content(Builder builder) {
            this.fields = builder.fields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List < Fields> getFields() {
            return this.fields;
        }

        public static final class Builder {
            private java.util.List < Fields> fields; 

            /**
             * Fields.
             */
            public Builder fields(java.util.List < Fields> fields) {
                this.fields = fields;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
