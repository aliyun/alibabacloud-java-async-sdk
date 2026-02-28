// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link InvokeDataAPIServiceRequest} extends {@link RequestModel}
 *
 * <p>InvokeDataAPIServiceRequest</p>
 */
public class InvokeDataAPIServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiSrn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiSrn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Param")
    private java.util.List<Param> param;

    private InvokeDataAPIServiceRequest(Builder builder) {
        super(builder);
        this.apiSrn = builder.apiSrn;
        this.iotInstanceId = builder.iotInstanceId;
        this.param = builder.param;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeDataAPIServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiSrn
     */
    public String getApiSrn() {
        return this.apiSrn;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return param
     */
    public java.util.List<Param> getParam() {
        return this.param;
    }

    public static final class Builder extends Request.Builder<InvokeDataAPIServiceRequest, Builder> {
        private String apiSrn; 
        private String iotInstanceId; 
        private java.util.List<Param> param; 

        private Builder() {
            super();
        } 

        private Builder(InvokeDataAPIServiceRequest request) {
            super(request);
            this.apiSrn = request.apiSrn;
            this.iotInstanceId = request.iotInstanceId;
            this.param = request.param;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:iot:<em>:127103983461</em>***:serveapi/device/getDeviceCountByStatus2</p>
         */
        public Builder apiSrn(String apiSrn) {
            this.putBodyParameter("ApiSrn", apiSrn);
            this.apiSrn = apiSrn;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Param.
         */
        public Builder param(java.util.List<Param> param) {
            this.putBodyParameter("Param", param);
            this.param = param;
            return this;
        }

        @Override
        public InvokeDataAPIServiceRequest build() {
            return new InvokeDataAPIServiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvokeDataAPIServiceRequest} extends {@link TeaModel}
     *
     * <p>InvokeDataAPIServiceRequest</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListParamType")
        private String listParamType;

        @com.aliyun.core.annotation.NameInMap("ListParamValue")
        private java.util.List<String> listParamValue;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private Param(Builder builder) {
            this.listParamType = builder.listParamType;
            this.listParamValue = builder.listParamValue;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return listParamType
         */
        public String getListParamType() {
            return this.listParamType;
        }

        /**
         * @return listParamValue
         */
        public java.util.List<String> getListParamValue() {
            return this.listParamValue;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String listParamType; 
            private java.util.List<String> listParamValue; 
            private String paramName; 
            private String paramType; 
            private String paramValue; 

            private Builder() {
            } 

            private Builder(Param model) {
                this.listParamType = model.listParamType;
                this.listParamValue = model.listParamValue;
                this.paramName = model.paramName;
                this.paramType = model.paramType;
                this.paramValue = model.paramValue;
            } 

            /**
             * ListParamType.
             */
            public Builder listParamType(String listParamType) {
                this.listParamType = listParamType;
                return this;
            }

            /**
             * ListParamValue.
             */
            public Builder listParamValue(java.util.List<String> listParamValue) {
                this.listParamValue = listParamValue;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * ParamValue.
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
