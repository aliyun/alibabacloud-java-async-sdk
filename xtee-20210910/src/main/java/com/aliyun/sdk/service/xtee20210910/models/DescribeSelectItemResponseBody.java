// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSelectItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSelectItemResponseBody</p>
 */
public class DescribeSelectItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeSelectItemResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSelectItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeSelectItemResponseBody build() {
            return new DescribeSelectItemResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("monitorStatusList")
        private java.util.List < String > monitorStatusList;

        @com.aliyun.core.annotation.NameInMap("taskIdList")
        private java.util.List < String > taskIdList;

        private ResultObject(Builder builder) {
            this.monitorStatusList = builder.monitorStatusList;
            this.taskIdList = builder.taskIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return monitorStatusList
         */
        public java.util.List < String > getMonitorStatusList() {
            return this.monitorStatusList;
        }

        /**
         * @return taskIdList
         */
        public java.util.List < String > getTaskIdList() {
            return this.taskIdList;
        }

        public static final class Builder {
            private java.util.List < String > monitorStatusList; 
            private java.util.List < String > taskIdList; 

            /**
             * monitorStatusList.
             */
            public Builder monitorStatusList(java.util.List < String > monitorStatusList) {
                this.monitorStatusList = monitorStatusList;
                return this;
            }

            /**
             * taskIdList.
             */
            public Builder taskIdList(java.util.List < String > taskIdList) {
                this.taskIdList = taskIdList;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
