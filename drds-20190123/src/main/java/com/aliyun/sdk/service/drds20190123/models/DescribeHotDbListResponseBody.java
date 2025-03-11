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
 * {@link DescribeHotDbListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHotDbListResponseBody</p>
 */
public class DescribeHotDbListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeHotDbListResponseBody(Builder builder) {
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHotDbListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private Data data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The result that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>msg</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B6B7BDC-575D-4A77-A4F8-24B7EF******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeHotDbListResponseBody build() {
            return new DescribeHotDbListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHotDbListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotDbListResponseBody</p>
     */
    public static class HotDbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<String> data;

        private HotDbList(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDbList create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<String> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<String> data; 

            /**
             * data.
             */
            public Builder data(java.util.List<String> data) {
                this.data = data;
                return this;
            }

            public HotDbList build() {
                return new HotDbList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotDbListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotDbListResponseBody</p>
     */
    public static class InstanceDb extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotDbList")
        private HotDbList hotDbList;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        private InstanceDb(Builder builder) {
            this.hotDbList = builder.hotDbList;
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDb create() {
            return builder().build();
        }

        /**
         * @return hotDbList
         */
        public HotDbList getHotDbList() {
            return this.hotDbList;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private HotDbList hotDbList; 
            private String instanceName; 

            /**
             * HotDbList.
             */
            public Builder hotDbList(HotDbList hotDbList) {
                this.hotDbList = hotDbList;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceName</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public InstanceDb build() {
                return new InstanceDb(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotDbListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotDbListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceDb")
        private java.util.List<InstanceDb> instanceDb;

        private List(Builder builder) {
            this.instanceDb = builder.instanceDb;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return instanceDb
         */
        public java.util.List<InstanceDb> getInstanceDb() {
            return this.instanceDb;
        }

        public static final class Builder {
            private java.util.List<InstanceDb> instanceDb; 

            /**
             * InstanceDb.
             */
            public Builder instanceDb(java.util.List<InstanceDb> instanceDb) {
                this.instanceDb = instanceDb;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHotDbListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHotDbListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("RandomCode")
        private String randomCode;

        private Data(Builder builder) {
            this.list = builder.list;
            this.randomCode = builder.randomCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return randomCode
         */
        public String getRandomCode() {
            return this.randomCode;
        }

        public static final class Builder {
            private List list; 
            private String randomCode; 

            /**
             * <p>The information about the databases on which hot-spot scale-out is performed.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The random number.</p>
             * 
             * <strong>example:</strong>
             * <p>jzhz</p>
             */
            public Builder randomCode(String randomCode) {
                this.randomCode = randomCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
