// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListYydComputeTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>ListYydComputeTaskListResponseBody</p>
 */
public class ListYydComputeTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListYydComputeTaskListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListYydComputeTaskListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String code; 
        private java.util.List < Data> data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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

        public ListYydComputeTaskListResponseBody build() {
            return new ListYydComputeTaskListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("appId")
        private Long appId;

        @NameInMap("bcId")
        private Long bcId;

        @NameInMap("gmtCreate")
        private String gmtCreate;

        @NameInMap("gmtModified")
        private String gmtModified;

        @NameInMap("name")
        private String name;

        @NameInMap("remarks")
        private String remarks;

        @NameInMap("state")
        private String state;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.bcId = builder.bcId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.remarks = builder.remarks;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return bcId
         */
        public Long getBcId() {
            return this.bcId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long appId; 
            private Long bcId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String name; 
            private String remarks; 
            private String state; 

            /**
             * appId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * bcId.
             */
            public Builder bcId(Long bcId) {
                this.bcId = bcId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
