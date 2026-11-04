// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListFlowNodePrototypeV2ResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowNodePrototypeV2ResponseBody</p>
 */
public class ListFlowNodePrototypeV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListFlowNodePrototypeV2ResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowNodePrototypeV2ResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Long getCode() {
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
        private String accessDeniedDetail; 
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListFlowNodePrototypeV2ResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The access denied details.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The error code. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFlowNodePrototypeV2ResponseBody build() {
            return new ListFlowNodePrototypeV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowNodePrototypeV2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowNodePrototypeV2ResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("GroupCode")
        private String groupCode;

        @com.aliyun.core.annotation.NameInMap("PublicExtend")
        private String publicExtend;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Model(Builder builder) {
            this.code = builder.code;
            this.groupCode = builder.groupCode;
            this.publicExtend = builder.publicExtend;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return groupCode
         */
        public String getGroupCode() {
            return this.groupCode;
        }

        /**
         * @return publicExtend
         */
        public String getPublicExtend() {
            return this.publicExtend;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String code; 
            private String groupCode; 
            private String publicExtend; 
            private String status; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.code = model.code;
                this.groupCode = model.groupCode;
                this.publicExtend = model.publicExtend;
                this.status = model.status;
            } 

            /**
             * <p>The component prototype code.</p>
             * 
             * <strong>example:</strong>
             * <p>SendWhatsAppMessageNode</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The component group code.</p>
             * 
             * <strong>example:</strong>
             * <p>Core</p>
             */
            public Builder groupCode(String groupCode) {
                this.groupCode = groupCode;
                return this;
            }

            /**
             * <p>The public extension information. This is used by the frontend to display extended information of flow components. The value is a JSON string. The first parameter in the string represents the flow component title. The following section describes the other fields:</p>
             * <ul>
             * <li><p>en: the English information of the flow component.</p>
             * </li>
             * <li><p>zh: the Chinese information of the flow component.</p>
             * </li>
             * <li><p>name: the name of the flow component.</p>
             * </li>
             * <li><p>remark: the remarks of the flow component.</p>
             * </li>
             * <li><p>order: the display order of the flow component.</p>
             * </li>
             * <li><p>style: the style of the flow component.</p>
             * </li>
             * <li><p>svg: the icon URL of the flow component.</p>
             * </li>
             * <li><p>icon: a deprecated field.</p>
             * </li>
             * <li><p>bgcolor: the background color of the icon.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;i18n\&quot;: {\&quot;en\&quot;: {\&quot;name\&quot;: \&quot;Send a WhatsApp Message\&quot;, \&quot;remark\&quot;: \&quot;Send a message with the ability for the user to reply utilizing WhatsApp specific features.\&quot;}, \&quot;zh\&quot;: {\&quot;name\&quot;: \&quot;Send WhatsApp messages\&quot;, \&quot;remark\&quot;: \&quot;Send a message that allows users to reply using specific features of WhatsApp\&quot;}}, \&quot;order\&quot;: \&quot;9000\&quot;, \&quot;style\&quot;: {\&quot;svg\&quot;: \&quot;<a href="https://img.alicdn.com/***********************************%5C%5C">https://img.alicdn.com/***********************************\\</a>&quot;, \&quot;icon\&quot;: \&quot;<a href="https://img.alicdn.com/***********************************%5C%5C">https://img.alicdn.com/***********************************\\</a>&quot;, \&quot;bgcolor\&quot;: \&quot;blue\&quot;}}</p>
             */
            public Builder publicExtend(String publicExtend) {
                this.publicExtend = publicExtend;
                return this;
            }

            /**
             * <p>The component prototype status. Default value: NORMAL.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlowNodePrototypeV2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowNodePrototypeV2ResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Model")
        private java.util.List<Model> model;

        private Data(Builder builder) {
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public java.util.List<Model> getModel() {
            return this.model;
        }

        public static final class Builder {
            private java.util.List<Model> model; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.model = model.model;
            } 

            /**
             * <p>The list of request result data.</p>
             */
            public Builder model(java.util.List<Model> model) {
                this.model = model;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
