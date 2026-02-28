// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDeviceGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceGroupListResponseBody</p>
 */
public class QueryDeviceGroupListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private QueryDeviceGroupListResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceGroupListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private Data data; 
        private String errorMessage; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(QueryDeviceGroupListResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.pageCount = model.pageCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The group information returned if the call succeeds. For more information, see the GroupInfo parameter.</p>
         * <blockquote>
         * <p> The returned group information is sorted in reverse chronological order in which the groups are created.</p>
         * </blockquote>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The number of entries return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BEFCA316-D6C7-470C-81ED-1FF4FFD4AA0D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that were returned.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryDeviceGroupListResponseBody build() {
            return new QueryDeviceGroupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceGroupListResponseBody</p>
     */
    public static class GroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupDesc")
        private String groupDesc;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        private GroupInfo(Builder builder) {
            this.groupDesc = builder.groupDesc;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.utcCreate = builder.utcCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfo create() {
            return builder().build();
        }

        /**
         * @return groupDesc
         */
        public String getGroupDesc() {
            return this.groupDesc;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public static final class Builder {
            private String groupDesc; 
            private String groupId; 
            private String groupName; 
            private String groupType; 
            private String utcCreate; 

            private Builder() {
            } 

            private Builder(GroupInfo model) {
                this.groupDesc = model.groupDesc;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.utcCreate = model.utcCreate;
            } 

            /**
             * <p>The description of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>usefulGroup</p>
             */
            public Builder groupDesc(String groupDesc) {
                this.groupDesc = groupDesc;
                return this;
            }

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>Kzt9FD8wje8o****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>LINK_PLATFORM_DYNAMIC</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The time when the group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-09T02:58:34.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            public GroupInfo build() {
                return new GroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceGroupListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupInfo")
        private java.util.List<GroupInfo> groupInfo;

        private Data(Builder builder) {
            this.groupInfo = builder.groupInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groupInfo
         */
        public java.util.List<GroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

        public static final class Builder {
            private java.util.List<GroupInfo> groupInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.groupInfo = model.groupInfo;
            } 

            /**
             * GroupInfo.
             */
            public Builder groupInfo(java.util.List<GroupInfo> groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
