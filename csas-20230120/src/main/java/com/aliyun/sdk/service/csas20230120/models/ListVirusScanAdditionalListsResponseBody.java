// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVirusScanAdditionalListsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirusScanAdditionalListsResponseBody</p>
 */
public class ListVirusScanAdditionalListsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdditionalLists")
    private java.util.List<AdditionalLists> additionalLists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVirusScanAdditionalListsResponseBody(Builder builder) {
        this.additionalLists = builder.additionalLists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanAdditionalListsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalLists
     */
    public java.util.List<AdditionalLists> getAdditionalLists() {
        return this.additionalLists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AdditionalLists> additionalLists; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListVirusScanAdditionalListsResponseBody model) {
            this.additionalLists = model.additionalLists;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of blacklists and whitelists grouped by match dimension. If a match dimension does not contain any list entries, the dimension is not included in the list.</p>
         */
        public Builder additionalLists(java.util.List<AdditionalLists> additionalLists) {
            this.additionalLists = additionalLists;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVirusScanAdditionalListsResponseBody build() {
            return new ListVirusScanAdditionalListsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirusScanAdditionalListsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanAdditionalListsResponseBody</p>
     */
    public static class ListDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("ListId")
        private String listId;

        private ListDetail(Builder builder) {
            this.createTime = builder.createTime;
            this.detail = builder.detail;
            this.listId = builder.listId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListDetail create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return listId
         */
        public String getListId() {
            return this.listId;
        }

        public static final class Builder {
            private String createTime; 
            private String detail; 
            private String listId; 

            private Builder() {
            } 

            private Builder(ListDetail model) {
                this.createTime = model.createTime;
                this.detail = model.detail;
                this.listId = model.listId;
            } 

            /**
             * <p>The creation time of the list entry. The time is in the yyyy-MM-dd HH:mm:ss format and uses the UTC+8 time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-21 10:24:31</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The content of the list entry. The meaning is determined by the AdditionalType to which it belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>.tmp</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The ID of the list entry.</p>
             * 
             * <strong>example:</strong>
             * <p>additional-list-4d7b1e9a6c38****</p>
             */
            public Builder listId(String listId) {
                this.listId = listId;
                return this;
            }

            public ListDetail build() {
                return new ListDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanAdditionalListsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanAdditionalListsResponseBody</p>
     */
    public static class Lists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListDetail")
        private java.util.List<ListDetail> listDetail;

        @com.aliyun.core.annotation.NameInMap("ListType")
        private String listType;

        private Lists(Builder builder) {
            this.listDetail = builder.listDetail;
            this.listType = builder.listType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lists create() {
            return builder().build();
        }

        /**
         * @return listDetail
         */
        public java.util.List<ListDetail> getListDetail() {
            return this.listDetail;
        }

        /**
         * @return listType
         */
        public String getListType() {
            return this.listType;
        }

        public static final class Builder {
            private java.util.List<ListDetail> listDetail; 
            private String listType; 

            private Builder() {
            } 

            private Builder(Lists model) {
                this.listDetail = model.listDetail;
                this.listType = model.listType;
            } 

            /**
             * <p>The list of list entries.</p>
             */
            public Builder listDetail(java.util.List<ListDetail> listDetail) {
                this.listDetail = listDetail;
                return this;
            }

            /**
             * <p>The list type. Valid values:</p>
             * <ul>
             * <li><strong>Blacklist</strong>: Blacklist. Matched files are directly identified as virus files.</li>
             * <li><strong>Whitelist</strong>: Whitelist. Matched files are excluded from virus detection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Whitelist</p>
             */
            public Builder listType(String listType) {
                this.listType = listType;
                return this;
            }

            public Lists build() {
                return new Lists(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanAdditionalListsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanAdditionalListsResponseBody</p>
     */
    public static class AdditionalLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalType")
        private String additionalType;

        @com.aliyun.core.annotation.NameInMap("Lists")
        private java.util.List<Lists> lists;

        private AdditionalLists(Builder builder) {
            this.additionalType = builder.additionalType;
            this.lists = builder.lists;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalLists create() {
            return builder().build();
        }

        /**
         * @return additionalType
         */
        public String getAdditionalType() {
            return this.additionalType;
        }

        /**
         * @return lists
         */
        public java.util.List<Lists> getLists() {
            return this.lists;
        }

        public static final class Builder {
            private String additionalType; 
            private java.util.List<Lists> lists; 

            private Builder() {
            } 

            private Builder(AdditionalLists model) {
                this.additionalType = model.additionalType;
                this.lists = model.lists;
            } 

            /**
             * <p>The match dimension of the list entry. Valid values:</p>
             * <ul>
             * <li><strong>FileSuffix</strong>: Matches by file name extension.</li>
             * <li><strong>FileName</strong>: Matches by file name.</li>
             * <li><strong>FolderName</strong>: Matches by folder name.</li>
             * <li><strong>FilePath</strong>: Matches by file path.</li>
             * <li><strong>FileMd5</strong>: Matches by file MD5 value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FileSuffix</p>
             */
            public Builder additionalType(String additionalType) {
                this.additionalType = additionalType;
                return this;
            }

            /**
             * <p>The lists grouped by list type under the match dimension.</p>
             */
            public Builder lists(java.util.List<Lists> lists) {
                this.lists = lists;
                return this;
            }

            public AdditionalLists build() {
                return new AdditionalLists(this);
            } 

        } 

    }
}
