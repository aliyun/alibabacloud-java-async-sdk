// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link IncreaseListResponseBody} extends {@link TeaModel}
 *
 * <p>IncreaseListResponseBody</p>
 */
public class IncreaseListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private IncreaseListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncreaseListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(IncreaseListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the batch task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B3137727-7D6E-488C-BA21-0E034C38A879</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public IncreaseListResponseBody build() {
            return new IncreaseListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IncreaseListResponseBody} extends {@link TeaModel}
     *
     * <p>IncreaseListResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("CallbackAddress")
        private String callbackAddress;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ErrorUrl")
        private String errorUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private Long utcModified;

        private Instance(Builder builder) {
            this.bucketName = builder.bucketName;
            this.callbackAddress = builder.callbackAddress;
            this.code = builder.code;
            this.errorUrl = builder.errorUrl;
            this.id = builder.id;
            this.msg = builder.msg;
            this.path = builder.path;
            this.status = builder.status;
            this.utcCreate = builder.utcCreate;
            this.utcModified = builder.utcModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return callbackAddress
         */
        public String getCallbackAddress() {
            return this.callbackAddress;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return errorUrl
         */
        public String getErrorUrl() {
            return this.errorUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcModified
         */
        public Long getUtcModified() {
            return this.utcModified;
        }

        public static final class Builder {
            private String bucketName; 
            private String callbackAddress; 
            private String code; 
            private String errorUrl; 
            private Long id; 
            private String msg; 
            private String path; 
            private String status; 
            private String utcCreate; 
            private Long utcModified; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.bucketName = model.bucketName;
                this.callbackAddress = model.callbackAddress;
                this.code = model.code;
                this.errorUrl = model.errorUrl;
                this.id = model.id;
                this.msg = model.msg;
                this.path = model.path;
                this.status = model.status;
                this.utcCreate = model.utcCreate;
                this.utcModified = model.utcModified;
            } 

            /**
             * <p>The name of the Object Storage Service (OSS) bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>bucketName</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The callback address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxxx">http://xxxxx</a></p>
             */
            public Builder callbackAddress(String callbackAddress) {
                this.callbackAddress = callbackAddress;
                return this;
            }

            /**
             * <p>The error code returned.</p>
             * <ul>
             * <li>A value of 0 indicates that the operation is successful.</li>
             * <li>Values other than 0 indicate errors.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The address where you can download the result. The address is valid for 2 hours.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://imagesearchname.oss-cn-shanghai.aliyuncs.com/xxx">https://imagesearchname.oss-cn-shanghai.aliyuncs.com/xxx</a></p>
             */
            public Builder errorUrl(String errorUrl) {
                this.errorUrl = errorUrl;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>sucess</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The absolute path to the increment.meta file in the bucket. The path must start with a forward slash (/) and cannot end with a forward slash (/).</p>
             * 
             * <strong>example:</strong>
             * <p>/xx/xx</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The status of the batch task.</p>
             * <ul>
             * <li>PROCESSING: in progress</li>
             * <li>FAIL: failed</li>
             * <li>SUCCESS: successful</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the task was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1629095713000</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The time when the task was updated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1629095760000</p>
             */
            public Builder utcModified(Long utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link IncreaseListResponseBody} extends {@link TeaModel}
     *
     * <p>IncreaseListResponseBody</p>
     */
    public static class Increments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

        private Increments(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Increments create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            private Builder() {
            } 

            private Builder(Increments model) {
                this.instance = model.instance;
            } 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Increments build() {
                return new Increments(this);
            } 

        } 

    }
    /**
     * 
     * {@link IncreaseListResponseBody} extends {@link TeaModel}
     *
     * <p>IncreaseListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Increments")
        private Increments increments;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.increments = builder.increments;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return increments
         */
        public Increments getIncrements() {
            return this.increments;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Increments increments; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.increments = model.increments;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A list of batch tasks.</p>
             */
            public Builder increments(Increments increments) {
                this.increments = increments;
                return this;
            }

            /**
             * <p>The number of the page to return.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries to return on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
