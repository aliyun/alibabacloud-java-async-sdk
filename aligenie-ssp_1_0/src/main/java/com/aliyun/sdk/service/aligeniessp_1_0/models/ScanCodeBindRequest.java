// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ScanCodeBindRequest} extends {@link RequestModel}
 *
 * <p>ScanCodeBindRequest</p>
 */
public class ScanCodeBindRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BindReq")
    @com.aliyun.core.annotation.Validation(required = true)
    private BindReq bindReq;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserInfo userInfo;

    private ScanCodeBindRequest(Builder builder) {
        super(builder);
        this.bindReq = builder.bindReq;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanCodeBindRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindReq
     */
    public BindReq getBindReq() {
        return this.bindReq;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<ScanCodeBindRequest, Builder> {
        private BindReq bindReq; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(ScanCodeBindRequest request) {
            super(request);
            this.bindReq = request.bindReq;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Input parameters for QR code scanning binding</p>
         * <p>This parameter is required.</p>
         */
        public Builder bindReq(BindReq bindReq) {
            String bindReqShrink = shrink(bindReq, "BindReq", "json");
            this.putBodyParameter("BindReq", bindReqShrink);
            this.bindReq = bindReq;
            return this;
        }

        /**
         * <p>User identity information</p>
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putBodyParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public ScanCodeBindRequest build() {
            return new ScanCodeBindRequest(this);
        } 

    } 

    /**
     * 
     * {@link ScanCodeBindRequest} extends {@link TeaModel}
     *
     * <p>ScanCodeBindRequest</p>
     */
    public static class BindReq extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private String extInfo;

        private BindReq(Builder builder) {
            this.clientId = builder.clientId;
            this.code = builder.code;
            this.extInfo = builder.extInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindReq create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        public static final class Builder {
            private String clientId; 
            private String code; 
            private String extInfo; 

            private Builder() {
            } 

            private Builder(BindReq model) {
                this.clientId = model.clientId;
                this.code = model.code;
                this.extInfo = model.extInfo;
            } 

            /**
             * <p>Product client ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RnY8v0W0ZVn58ZrUAOr2RD</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>authCode</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ASdfre</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Extension parameter</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key&quot;:&quot;value&quot;}</p>
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            public BindReq build() {
                return new BindReq(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScanCodeBindRequest} extends {@link TeaModel}
     *
     * <p>ScanCodeBindRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private UserInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>Value corresponding to the encoding type. Enter the Project ID of the project to which the product belongs. You can view this in the Tmall Genie AI Platform console.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>129****0946</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding type. Enter PROJECT_ID here.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>User Identifier. Enter the value of userOpenId or userUnionId.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DAFE****ce3ej=</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Device ID type:<br>OPEN_ID: Default Device ID identifier.<br>UNION_ID: Organization-dimension Device ID identifier. You must request an organization in advance on the Open Platform.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID. Required if IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
