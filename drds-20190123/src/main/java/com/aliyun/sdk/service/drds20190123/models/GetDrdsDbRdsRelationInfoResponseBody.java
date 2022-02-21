// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDrdsDbRdsRelationInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDrdsDbRdsRelationInfoResponseBody</p>
 */
public class GetDrdsDbRdsRelationInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDrdsDbRdsRelationInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDrdsDbRdsRelationInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        public GetDrdsDbRdsRelationInfoResponseBody build() {
            return new GetDrdsDbRdsRelationInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("RdsInstanceId")
        private String rdsInstanceId;

        @NameInMap("ReadOnlyInstanceInfo")
        private java.util.List < String > readOnlyInstanceInfo;

        @NameInMap("UsedInstanceId")
        private String usedInstanceId;

        @NameInMap("UsedInstanceType")
        private String usedInstanceType;

        private Data(Builder builder) {
            this.rdsInstanceId = builder.rdsInstanceId;
            this.readOnlyInstanceInfo = builder.readOnlyInstanceInfo;
            this.usedInstanceId = builder.usedInstanceId;
            this.usedInstanceType = builder.usedInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return rdsInstanceId
         */
        public String getRdsInstanceId() {
            return this.rdsInstanceId;
        }

        /**
         * @return readOnlyInstanceInfo
         */
        public java.util.List < String > getReadOnlyInstanceInfo() {
            return this.readOnlyInstanceInfo;
        }

        /**
         * @return usedInstanceId
         */
        public String getUsedInstanceId() {
            return this.usedInstanceId;
        }

        /**
         * @return usedInstanceType
         */
        public String getUsedInstanceType() {
            return this.usedInstanceType;
        }

        public static final class Builder {
            private String rdsInstanceId; 
            private java.util.List < String > readOnlyInstanceInfo; 
            private String usedInstanceId; 
            private String usedInstanceType; 

            /**
             * RdsInstanceId.
             */
            public Builder rdsInstanceId(String rdsInstanceId) {
                this.rdsInstanceId = rdsInstanceId;
                return this;
            }

            /**
             * ReadOnlyInstanceInfo.
             */
            public Builder readOnlyInstanceInfo(java.util.List < String > readOnlyInstanceInfo) {
                this.readOnlyInstanceInfo = readOnlyInstanceInfo;
                return this;
            }

            /**
             * UsedInstanceId.
             */
            public Builder usedInstanceId(String usedInstanceId) {
                this.usedInstanceId = usedInstanceId;
                return this;
            }

            /**
             * UsedInstanceType.
             */
            public Builder usedInstanceType(String usedInstanceType) {
                this.usedInstanceType = usedInstanceType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
