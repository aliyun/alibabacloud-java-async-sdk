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
 * {@link DescribeDrdsDbRdsNameListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDbRdsNameListResponseBody</p>
 */
public class DescribeDrdsDbRdsNameListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceNameList")
    private InstanceNameList instanceNameList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>Indicates the instances that are used to store the data of a database.</p>
         */
        public Builder instanceNameList(InstanceNameList instanceNameList) {
            this.instanceNameList = instanceNameList;
            return this;
        }

        /**
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7E6FA2BF-05F2-44DD-95C0-D1B5B8xxxxxx</p>
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

        public DescribeDrdsDbRdsNameListResponseBody build() {
            return new DescribeDrdsDbRdsNameListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsDbRdsNameListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDbRdsNameListResponseBody</p>
     */
    public static class InstanceNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private java.util.List<String> instanceName;

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
        public java.util.List<String> getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private java.util.List<String> instanceName; 

            /**
             * InstanceName.
             */
            public Builder instanceName(java.util.List<String> instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public InstanceNameList build() {
                return new InstanceNameList(this);
            } 

        } 

    }
}
