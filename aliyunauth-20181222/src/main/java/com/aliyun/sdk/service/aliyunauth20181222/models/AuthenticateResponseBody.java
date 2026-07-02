// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunauth20181222.models;

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
 * {@link AuthenticateResponseBody} extends {@link TeaModel}
 *
 * <p>AuthenticateResponseBody</p>
 */
public class AuthenticateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AuthenticateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthenticateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AuthenticateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AuthenticateResponseBody build() {
            return new AuthenticateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AuthenticateResponseBody} extends {@link TeaModel}
     *
     * <p>AuthenticateResponseBody</p>
     */
    public static class QueryAuthRSDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ExpandContent")
        private String expandContent;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldVid")
        private String fieldVid;

        private QueryAuthRSDTO(Builder builder) {
            this.content = builder.content;
            this.expandContent = builder.expandContent;
            this.fieldName = builder.fieldName;
            this.fieldVid = builder.fieldVid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryAuthRSDTO create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return expandContent
         */
        public String getExpandContent() {
            return this.expandContent;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldVid
         */
        public String getFieldVid() {
            return this.fieldVid;
        }

        public static final class Builder {
            private String content; 
            private String expandContent; 
            private String fieldName; 
            private String fieldVid; 

            private Builder() {
            } 

            private Builder(QueryAuthRSDTO model) {
                this.content = model.content;
                this.expandContent = model.expandContent;
                this.fieldName = model.fieldName;
                this.fieldVid = model.fieldVid;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ExpandContent.
             */
            public Builder expandContent(String expandContent) {
                this.expandContent = expandContent;
                return this;
            }

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * FieldVid.
             */
            public Builder fieldVid(String fieldVid) {
                this.fieldVid = fieldVid;
                return this;
            }

            public QueryAuthRSDTO build() {
                return new QueryAuthRSDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link AuthenticateResponseBody} extends {@link TeaModel}
     *
     * <p>AuthenticateResponseBody</p>
     */
    public static class UserInputList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueryAuthRSDTO")
        private java.util.List<QueryAuthRSDTO> queryAuthRSDTO;

        private UserInputList(Builder builder) {
            this.queryAuthRSDTO = builder.queryAuthRSDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInputList create() {
            return builder().build();
        }

        /**
         * @return queryAuthRSDTO
         */
        public java.util.List<QueryAuthRSDTO> getQueryAuthRSDTO() {
            return this.queryAuthRSDTO;
        }

        public static final class Builder {
            private java.util.List<QueryAuthRSDTO> queryAuthRSDTO; 

            private Builder() {
            } 

            private Builder(UserInputList model) {
                this.queryAuthRSDTO = model.queryAuthRSDTO;
            } 

            /**
             * QueryAuthRSDTO.
             */
            public Builder queryAuthRSDTO(java.util.List<QueryAuthRSDTO> queryAuthRSDTO) {
                this.queryAuthRSDTO = queryAuthRSDTO;
                return this;
            }

            public UserInputList build() {
                return new UserInputList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AuthenticateResponseBody} extends {@link TeaModel}
     *
     * <p>AuthenticateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authorized")
        private Boolean authorized;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OperateCode")
        private String operateCode;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("RecordVid")
        private String recordVid;

        @com.aliyun.core.annotation.NameInMap("UserInputList")
        private UserInputList userInputList;

        private Data(Builder builder) {
            this.authorized = builder.authorized;
            this.instanceId = builder.instanceId;
            this.operateCode = builder.operateCode;
            this.productCode = builder.productCode;
            this.recordVid = builder.recordVid;
            this.userInputList = builder.userInputList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorized
         */
        public Boolean getAuthorized() {
            return this.authorized;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return operateCode
         */
        public String getOperateCode() {
            return this.operateCode;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return recordVid
         */
        public String getRecordVid() {
            return this.recordVid;
        }

        /**
         * @return userInputList
         */
        public UserInputList getUserInputList() {
            return this.userInputList;
        }

        public static final class Builder {
            private Boolean authorized; 
            private String instanceId; 
            private String operateCode; 
            private String productCode; 
            private String recordVid; 
            private UserInputList userInputList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorized = model.authorized;
                this.instanceId = model.instanceId;
                this.operateCode = model.operateCode;
                this.productCode = model.productCode;
                this.recordVid = model.recordVid;
                this.userInputList = model.userInputList;
            } 

            /**
             * Authorized.
             */
            public Builder authorized(Boolean authorized) {
                this.authorized = authorized;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OperateCode.
             */
            public Builder operateCode(String operateCode) {
                this.operateCode = operateCode;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * RecordVid.
             */
            public Builder recordVid(String recordVid) {
                this.recordVid = recordVid;
                return this;
            }

            /**
             * UserInputList.
             */
            public Builder userInputList(UserInputList userInputList) {
                this.userInputList = userInputList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
