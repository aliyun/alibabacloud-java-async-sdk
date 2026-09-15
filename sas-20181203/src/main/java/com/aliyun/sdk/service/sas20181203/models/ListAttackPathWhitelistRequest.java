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
 * {@link ListAttackPathWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ListAttackPathWhitelistRequest</p>
 */
public class ListAttackPathWhitelistRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("PathNameDesc")
    private String pathNameDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathType")
    private String pathType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhitelistName")
    private String whitelistName;

    private ListAttackPathWhitelistRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.pathNameDesc = builder.pathNameDesc;
        this.pathType = builder.pathType;
        this.whitelistName = builder.whitelistName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAttackPathWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pathNameDesc
     */
    public String getPathNameDesc() {
        return this.pathNameDesc;
    }

    /**
     * @return pathType
     */
    public String getPathType() {
        return this.pathType;
    }

    /**
     * @return whitelistName
     */
    public String getWhitelistName() {
        return this.whitelistName;
    }

    public static final class Builder extends Request.Builder<ListAttackPathWhitelistRequest, Builder> {
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String pathNameDesc; 
        private String pathType; 
        private String whitelistName; 

        private Builder() {
            super();
        } 

        private Builder(ListAttackPathWhitelistRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.pathNameDesc = request.pathNameDesc;
            this.pathType = request.pathType;
            this.whitelistName = request.whitelistName;
        } 

        /**
         * <p>The page number when using paging. Default value: <strong>1</strong>.</p>
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
         * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of entries per page when using paging. Default value: 20.</p>
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
         * <p>The path name description.</p>
         * <blockquote>
         * <p>Call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query path name descriptions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ECS Instance Can Obtain Long-term Access Credential by Enabling Console Logon for RAM User</p>
         */
        public Builder pathNameDesc(String pathNameDesc) {
            this.putQueryParameter("PathNameDesc", pathNameDesc);
            this.pathNameDesc = pathNameDesc;
            return this;
        }

        /**
         * <p>The path type.</p>
         * <blockquote>
         * <p>Call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query path types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>role_escalation</p>
         */
        public Builder pathType(String pathType) {
            this.putQueryParameter("PathType", pathType);
            this.pathType = pathType;
            return this;
        }

        /**
         * <p>The whitelist name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder whitelistName(String whitelistName) {
            this.putQueryParameter("WhitelistName", whitelistName);
            this.whitelistName = whitelistName;
            return this;
        }

        @Override
        public ListAttackPathWhitelistRequest build() {
            return new ListAttackPathWhitelistRequest(this);
        } 

    } 

}
