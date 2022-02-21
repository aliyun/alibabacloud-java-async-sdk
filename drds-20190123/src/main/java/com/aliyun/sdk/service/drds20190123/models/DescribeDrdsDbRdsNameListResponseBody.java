// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDbRdsNameListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDbRdsNameListResponseBody</p>
 */
public class DescribeDrdsDbRdsNameListResponseBody extends TeaModel {
    @NameInMap("InstanceNameList")
    private InstanceNameList instanceNameList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDrdsDbRdsNameListResponseBody(Builder builder) {
        this.instanceNameList = builder.instanceNameList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDbRdsNameListResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceNameList
     */
    public InstanceNameList getInstanceNameList() {
        return this.instanceNameList;
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
        private InstanceNameList instanceNameList; 
        private String requestId; 
        private Boolean success; 

        /**
         * InstanceNameList.
         */
        public Builder instanceNameList(InstanceNameList instanceNameList) {
            this.instanceNameList = instanceNameList;
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

        public DescribeDrdsDbRdsNameListResponseBody build() {
            return new DescribeDrdsDbRdsNameListResponseBody(this);
        } 

    } 

    public static class InstanceNameList extends TeaModel {
        @NameInMap("InstanceName")
        private java.util.List < String > instanceName;

        private InstanceNameList(Builder builder) {
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceNameList create() {
            return builder().build();
        }

        /**
         * @return instanceName
         */
        public java.util.List < String > getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private java.util.List < String > instanceName; 

            /**
             * InstanceName.
             */
            public Builder instanceName(java.util.List < String > instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public InstanceNameList build() {
                return new InstanceNameList(this);
            } 

        } 

    }
}
