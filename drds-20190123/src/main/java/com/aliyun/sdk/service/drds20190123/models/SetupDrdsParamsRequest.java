// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupDrdsParamsRequest} extends {@link RequestModel}
 *
 * <p>SetupDrdsParamsRequest</p>
 */
public class SetupDrdsParamsRequest extends Request {
    @Query
    @NameInMap("Data")
    @Validation(required = true)
    private java.util.List < Data> data;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("ParamLevel")
    @Validation(required = true)
    private String paramLevel;

    @Query
    @NameInMap("RegionId")
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String drdsInstanceId; 
        private String paramLevel; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetupDrdsParamsRequest response) {
            super(response);
            this.data = response.data;
            this.drdsInstanceId = response.drdsInstanceId;
            this.paramLevel = response.paramLevel;
            this.regionId = response.regionId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * ParamLevel.
         */
        public Builder paramLevel(String paramLevel) {
            this.putQueryParameter("ParamLevel", paramLevel);
            this.paramLevel = paramLevel;
            return this;
        }

        /**
         * RegionId.
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

    public static class Data extends TeaModel {
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("ParamRanges")
        private String paramRanges;

        @NameInMap("ParamType")
        private String paramType;

        @NameInMap("ParamValue")
        private String paramValue;

        @NameInMap("ParamVariableName")
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
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * ParamRanges.
             */
            public Builder paramRanges(String paramRanges) {
                this.paramRanges = paramRanges;
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

            /**
             * ParamVariableName.
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
