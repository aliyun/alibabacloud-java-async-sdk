// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnRealTimeDeliveryFieldResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnRealTimeDeliveryFieldResponseBody</p>
 */
public class DescribeDcdnRealTimeDeliveryFieldResponseBody extends TeaModel {
    @NameInMap("Content")
    private Content content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnRealTimeDeliveryFieldResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnRealTimeDeliveryFieldResponseBody create() {
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
         * The returned results.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnRealTimeDeliveryFieldResponseBody build() {
            return new DescribeDcdnRealTimeDeliveryFieldResponseBody(this);
        } 

    } 

    public static class Fields extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("FieldName")
        private String fieldName;

        private Fields(Builder builder) {
            this.description = builder.description;
            this.fieldName = builder.fieldName;
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

        public static final class Builder {
            private String description; 
            private String fieldName; 

            /**
             * The description of the field.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the field. For more information about fields in real-time log entries, see [Fields in a real-time log](~~324199~~).
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("Fields")
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
