// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link QueryMediaListByURLRequest} extends {@link RequestModel}
 *
 * <p>QueryMediaListByURLRequest</p>
 */
public class QueryMediaListByURLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileURLs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileURLs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeMediaInfo")
    private Boolean includeMediaInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludePlayList")
    private Boolean includePlayList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeSnapshotList")
    private Boolean includeSnapshotList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeSummaryList")
    private Boolean includeSummaryList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QueryMediaListByURLRequest(Builder builder) {
        super(builder);
        this.fileURLs = builder.fileURLs;
        this.includeMediaInfo = builder.includeMediaInfo;
        this.includePlayList = builder.includePlayList;
        this.includeSnapshotList = builder.includeSnapshotList;
        this.includeSummaryList = builder.includeSummaryList;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaListByURLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileURLs
     */
    public String getFileURLs() {
        return this.fileURLs;
    }

    /**
     * @return includeMediaInfo
     */
    public Boolean getIncludeMediaInfo() {
        return this.includeMediaInfo;
    }

    /**
     * @return includePlayList
     */
    public Boolean getIncludePlayList() {
        return this.includePlayList;
    }

    /**
     * @return includeSnapshotList
     */
    public Boolean getIncludeSnapshotList() {
        return this.includeSnapshotList;
    }

    /**
     * @return includeSummaryList
     */
    public Boolean getIncludeSummaryList() {
        return this.includeSummaryList;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<QueryMediaListByURLRequest, Builder> {
        private String fileURLs; 
        private Boolean includeMediaInfo; 
        private Boolean includePlayList; 
        private Boolean includeSnapshotList; 
        private Boolean includeSummaryList; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMediaListByURLRequest request) {
            super(request);
            this.fileURLs = request.fileURLs;
            this.includeMediaInfo = request.includeMediaInfo;
            this.includePlayList = request.includePlayList;
            this.includeSnapshotList = request.includeSnapshotList;
            this.includeSummaryList = request.includeSummaryList;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The OSS URLs of the media files. To obtain the OSS URL of a media file, you can perform the following operations in the ApsaraVideo Media Processing (MPS) console: In the left-side navigation pane, choose <strong>Media Management</strong> &gt; <strong>Media List</strong>. Find the media file whose OSS URL you want to view and click <strong>Manage</strong> in the <strong>Actions</strong> column. The OSS URL of the media file is displayed on the <strong>Obtain Encoding URL</strong> tab. Separate multiple URLs with commas (,). You can query up to 10 media files at a time.</p>
         * <ul>
         * <li>The URL complies with RFC 3986 and is encoded in UTF-8, with reserved characters being percent-encoded. The value can be up to 3,200 bytes in size. For more information, see <a href="https://help.aliyun.com/document_detail/423796.html">URL encoding</a>.</li>
         * <li>Only OSS HTTP URLs are supported. Alibaba Cloud CDN URLs and HTTPS URLs are not supported.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket-****.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
         */
        public Builder fileURLs(String fileURLs) {
            this.putQueryParameter("FileURLs", fileURLs);
            this.fileURLs = fileURLs;
            return this;
        }

        /**
         * <p>Specifies whether to include media information in the returned result.</p>
         * <ul>
         * <li><p>Valid values: true and false.</p>
         * </li>
         * <li><p>Default value: <strong>false</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>To obtain detailed information about the media files, set this parameter to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeMediaInfo(Boolean includeMediaInfo) {
            this.putQueryParameter("IncludeMediaInfo", includeMediaInfo);
            this.includeMediaInfo = includeMediaInfo;
            return this;
        }

        /**
         * <p>Specifies whether to include playback information in the returned result.</p>
         * <ul>
         * <li>Valid values: true and false.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includePlayList(Boolean includePlayList) {
            this.putQueryParameter("IncludePlayList", includePlayList);
            this.includePlayList = includePlayList;
            return this;
        }

        /**
         * <p>Specifies whether to include snapshot information in the returned result.</p>
         * <ul>
         * <li>Valid values: true and false.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeSnapshotList(Boolean includeSnapshotList) {
            this.putQueryParameter("IncludeSnapshotList", includeSnapshotList);
            this.includeSnapshotList = includeSnapshotList;
            return this;
        }

        /**
         * <p>Specifies whether to include summaries in the returned result.</p>
         * <ul>
         * <li>Valid values: true and false.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeSummaryList(Boolean includeSummaryList) {
            this.putQueryParameter("IncludeSummaryList", includeSummaryList);
            this.includeSummaryList = includeSummaryList;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public QueryMediaListByURLRequest build() {
            return new QueryMediaListByURLRequest(this);
        } 

    } 

}
