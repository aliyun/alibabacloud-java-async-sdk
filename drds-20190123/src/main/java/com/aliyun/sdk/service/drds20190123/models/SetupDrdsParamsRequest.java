// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link SetupDrdsParamsRequest} extends {@link RequestModel}
 *
 * <p>SetupDrdsParamsRequest</p>
 */
public class SetupDrdsParamsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paramLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SetupDrdsParamsRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.paramLevel = builder.paramLevel;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetupDrdsParamsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return paramLevel
     */
    public String getParamLevel() {
        return this.paramLevel;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetupDrdsParamsRequest, Builder> {
        private java.util.List<Data> data; 
        private String drdsInstanceId; 
        private String paramLevel; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetupDrdsParamsRequest request) {
            super(request);
            this.data = request.data;
            this.drdsInstanceId = request.drdsInstanceId;
            this.paramLevel = request.paramLevel;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance for which you want to configure parameters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drdsjiii1b49****</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The resource for which you want to configure parameters. Valid values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong>: Configure parameters for the instance.</li>
         * <li><strong>DB</strong>: Configure parameters for the databases of the instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DB</p>
         */
        public Builder paramLevel(String paramLevel) {
            this.putQueryParameter("ParamLevel", paramLevel);
            this.paramLevel = paramLevel;
            return this;
        }

        /**
         * <p>The ID of the region in which the PolarDB-X 1.0 instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetupDrdsParamsRequest build() {
            return new SetupDrdsParamsRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetupDrdsParamsRequest} extends {@link TeaModel}
     *
     * <p>SetupDrdsParamsRequest</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("ParamRanges")
        private String paramRanges;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        @com.aliyun.core.annotation.NameInMap("ParamVariableName")
        private String paramVariableName;

        private Data(Builder builder) {
            this.dbName = builder.dbName;
            this.paramRanges = builder.paramRanges;
            this.paramType = builder.paramType;
            this.paramValue = builder.paramValue;
            this.paramVariableName = builder.paramVariableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return paramRanges
         */
        public String getParamRanges() {
            return this.paramRanges;
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

        /**
         * @return paramVariableName
         */
        public String getParamVariableName() {
            return this.paramVariableName;
        }

        public static final class Builder {
            private String dbName; 
            private String paramRanges; 
            private String paramType; 
            private String paramValue; 
            private String paramVariableName; 

            /**
             * <p>The name of the parameter that you want to configure for a database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The valid values of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[true|false]</p>
             */
            public Builder paramRanges(String paramRanges) {
                this.paramRanges = paramRanges;
                return this;
            }

            /**
             * <p>The type of the parameter that you want to configure. Valid values:</p>
             * <ul>
             * <li><strong>ATOM</strong>: the configuration item in the layer-3 data source.</li>
             * <li><strong>CONFIG</strong>: the configuration item in ConfigServer.</li>
             * <li><strong>DIAMOND</strong>: the configuration item in Diamond.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ATOM</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>The value of parameter that you want to configure.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            /**
             * <p>The name of the parameter that you want to configure.</p>
             * 
             * <strong>example:</strong>
             * <p>FORBID_EXECUTE_DML_ALL</p>
             */
            public Builder paramVariableName(String paramVariableName) {
                this.paramVariableName = paramVariableName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
