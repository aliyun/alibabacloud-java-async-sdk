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
 * {@link DumpMetaListResponseBody} extends {@link TeaModel}
 *
 * <p>DumpMetaListResponseBody</p>
 */
public class DumpMetaListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DumpMetaListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DumpMetaListResponseBody create() {
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

        private Builder(DumpMetaListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the task that is used to export metadata.</p>
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

        public DumpMetaListResponseBody build() {
            return new DumpMetaListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DumpMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DumpMetaListResponseBody</p>
     */
    public static class DumpMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MetaUrl")
        private String metaUrl;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private Long utcModified;

        private DumpMetaList(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.metaUrl = builder.metaUrl;
            this.msg = builder.msg;
            this.status = builder.status;
            this.utcCreate = builder.utcCreate;
            this.utcModified = builder.utcModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DumpMetaList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return metaUrl
         */
        public String getMetaUrl() {
            return this.metaUrl;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
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
            private String code; 
            private Long id; 
            private String metaUrl; 
            private String msg; 
            private String status; 
            private String utcCreate; 
            private Long utcModified; 

            private Builder() {
            } 

            private Builder(DumpMetaList model) {
                this.code = model.code;
                this.id = model.id;
                this.metaUrl = model.metaUrl;
                this.msg = model.msg;
                this.status = model.status;
                this.utcCreate = model.utcCreate;
                this.utcModified = model.utcModified;
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
             * <p>The address where you can download the metadata. The address is valid for 2 hours.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://imagesearchname.oss-cn-shanghai.aliyuncs.com/xxx">https://imagesearchname.oss-cn-shanghai.aliyuncs.com/xxx</a></p>
             */
            public Builder metaUrl(String metaUrl) {
                this.metaUrl = metaUrl;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The status of the export task.</p>
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

            public DumpMetaList build() {
                return new DumpMetaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DumpMetaListResponseBody} extends {@link TeaModel}
     *
     * <p>DumpMetaListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DumpMetaList")
        private java.util.List<DumpMetaList> dumpMetaList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.dumpMetaList = builder.dumpMetaList;
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
         * @return dumpMetaList
         */
        public java.util.List<DumpMetaList> getDumpMetaList() {
            return this.dumpMetaList;
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
            private java.util.List<DumpMetaList> dumpMetaList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dumpMetaList = model.dumpMetaList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A list of tasks that are used to export metadata.</p>
             */
            public Builder dumpMetaList(java.util.List<DumpMetaList> dumpMetaList) {
                this.dumpMetaList = dumpMetaList;
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
