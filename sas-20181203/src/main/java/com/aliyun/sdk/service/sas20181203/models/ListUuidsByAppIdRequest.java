// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListUuidsByAppIdRequest} extends {@link RequestModel}
 *
 * <p>ListUuidsByAppIdRequest</p>
 */
public class ListUuidsByAppIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppRegionId")
    private String appRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryUid")
    private Long resourceDirectoryUid;

    private ListUuidsByAppIdRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appRegionId = builder.appRegionId;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.resourceDirectoryUid = builder.resourceDirectoryUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUuidsByAppIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appRegionId
     */
    public String getAppRegionId() {
        return this.appRegionId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceDirectoryUid
     */
    public Long getResourceDirectoryUid() {
        return this.resourceDirectoryUid;
    }

    public static final class Builder extends Request.Builder<ListUuidsByAppIdRequest, Builder> {
        private String appId; 
        private String appRegionId; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private Long resourceDirectoryUid; 

        private Builder() {
            super();
        } 

        private Builder(ListUuidsByAppIdRequest request) {
            super(request);
            this.appId = request.appId;
            this.appRegionId = request.appRegionId;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.resourceDirectoryUid = request.resourceDirectoryUid;
        } 

        /**
         * <p>SAE application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5b41f4bf-349f-4263-89b1-9234c034****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder appRegionId(String appRegionId) {
            this.putQueryParameter("AppRegionId", appRegionId);
            this.appRegionId = appRegionId;
            return this;
        }

        /**
         * <p>The page number to display in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The language type for request and response, default is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of items to display per page in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Resource associated directory UID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder resourceDirectoryUid(Long resourceDirectoryUid) {
            this.putQueryParameter("ResourceDirectoryUid", resourceDirectoryUid);
            this.resourceDirectoryUid = resourceDirectoryUid;
            return this;
        }

        @Override
        public ListUuidsByAppIdRequest build() {
            return new ListUuidsByAppIdRequest(this);
        } 

    } 

}
