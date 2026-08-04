// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterQueryModelGroupsByApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ModelRouterQueryModelGroupsByApiKeyResponseBody</p>
 */
public class ModelRouterQueryModelGroupsByApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ModelRouterQueryModelGroupsByApiKeyResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryModelGroupsByApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ModelRouterQueryModelGroupsByApiKeyResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModelRouterQueryModelGroupsByApiKeyResponseBody build() {
            return new ModelRouterQueryModelGroupsByApiKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModelRouterQueryModelGroupsByApiKeyResponseBody} extends {@link TeaModel}
     *
     * <p>ModelRouterQueryModelGroupsByApiKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindType")
        private String bindType;

        @com.aliyun.core.annotation.NameInMap("clientId")
        private Long clientId;

        @com.aliyun.core.annotation.NameInMap("groups")
        private java.util.List<ModelGroupDTO> groups;

        @com.aliyun.core.annotation.NameInMap("standaloneModelList")
        private java.util.List<Long> standaloneModelList;

        private Data(Builder builder) {
            this.bindType = builder.bindType;
            this.clientId = builder.clientId;
            this.groups = builder.groups;
            this.standaloneModelList = builder.standaloneModelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindType
         */
        public String getBindType() {
            return this.bindType;
        }

        /**
         * @return clientId
         */
        public Long getClientId() {
            return this.clientId;
        }

        /**
         * @return groups
         */
        public java.util.List<ModelGroupDTO> getGroups() {
            return this.groups;
        }

        /**
         * @return standaloneModelList
         */
        public java.util.List<Long> getStandaloneModelList() {
            return this.standaloneModelList;
        }

        public static final class Builder {
            private String bindType; 
            private Long clientId; 
            private java.util.List<ModelGroupDTO> groups; 
            private java.util.List<Long> standaloneModelList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bindType = model.bindType;
                this.clientId = model.clientId;
                this.groups = model.groups;
                this.standaloneModelList = model.standaloneModelList;
            } 

            /**
             * bindType.
             */
            public Builder bindType(String bindType) {
                this.bindType = bindType;
                return this;
            }

            /**
             * clientId.
             */
            public Builder clientId(Long clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * groups.
             */
            public Builder groups(java.util.List<ModelGroupDTO> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * standaloneModelList.
             */
            public Builder standaloneModelList(java.util.List<Long> standaloneModelList) {
                this.standaloneModelList = standaloneModelList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
