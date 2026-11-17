// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRelatedResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListRelatedResourceResponseBody</p>
 */
public class ListRelatedResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRelatedResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRelatedResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRelatedResourceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This field is returned when the request fails. A successful response may not contain this field.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the request processing result. The value <code>success</code> is typically returned when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRelatedResourceResponseBody build() {
            return new ListRelatedResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRelatedResourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListRelatedResourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopCount")
        private Integer desktopCount;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupCount")
        private Integer desktopGroupCount;

        @com.aliyun.core.annotation.NameInMap("TemplateCount")
        private Integer templateCount;

        private Data(Builder builder) {
            this.desktopCount = builder.desktopCount;
            this.desktopGroupCount = builder.desktopGroupCount;
            this.templateCount = builder.templateCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return desktopCount
         */
        public Integer getDesktopCount() {
            return this.desktopCount;
        }

        /**
         * @return desktopGroupCount
         */
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        /**
         * @return templateCount
         */
        public Integer getTemplateCount() {
            return this.templateCount;
        }

        public static final class Builder {
            private Integer desktopCount; 
            private Integer desktopGroupCount; 
            private Integer templateCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.desktopCount = model.desktopCount;
                this.desktopGroupCount = model.desktopGroupCount;
                this.templateCount = model.templateCount;
            } 

            /**
             * <p>The number of cloud desktops associated with the image.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopCount(Integer desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The number of cloud desktop pools associated with the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder desktopGroupCount(Integer desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
                return this;
            }

            /**
             * <p>The number of associated templates.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder templateCount(Integer templateCount) {
                this.templateCount = templateCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
