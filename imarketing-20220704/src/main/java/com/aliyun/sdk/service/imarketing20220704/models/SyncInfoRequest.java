// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncInfoRequest} extends {@link RequestModel}
 *
 * <p>SyncInfoRequest</p>
 */
public class SyncInfoRequest extends Request {
    @Query
    @NameInMap("AccountNo")
    private String accountNo;

    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("ChainValue")
    private String chainValue;

    @Query
    @NameInMap("ComponentIdList")
    private String componentIdList;

    @Query
    @NameInMap("CreateUser")
    private String createUser;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("MainId")
    private Long mainId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NextChainValue")
    private String nextChainValue;

    @Query
    @NameInMap("OssFileUrl")
    private String ossFileUrl;

    @Query
    @NameInMap("PageId")
    private String pageId;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("UpdateUser")
    private String updateUser;

    @Query
    @NameInMap("Url")
    private String url;

    @Query
    @NameInMap("UrlType")
    private Integer urlType;

    private SyncInfoRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.bizId = builder.bizId;
        this.chainValue = builder.chainValue;
        this.componentIdList = builder.componentIdList;
        this.createUser = builder.createUser;
        this.id = builder.id;
        this.mainId = builder.mainId;
        this.name = builder.name;
        this.nextChainValue = builder.nextChainValue;
        this.ossFileUrl = builder.ossFileUrl;
        this.pageId = builder.pageId;
        this.status = builder.status;
        this.updateUser = builder.updateUser;
        this.url = builder.url;
        this.urlType = builder.urlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public String getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return chainValue
     */
    public String getChainValue() {
        return this.chainValue;
    }

    /**
     * @return componentIdList
     */
    public String getComponentIdList() {
        return this.componentIdList;
    }

    /**
     * @return createUser
     */
    public String getCreateUser() {
        return this.createUser;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mainId
     */
    public Long getMainId() {
        return this.mainId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextChainValue
     */
    public String getNextChainValue() {
        return this.nextChainValue;
    }

    /**
     * @return ossFileUrl
     */
    public String getOssFileUrl() {
        return this.ossFileUrl;
    }

    /**
     * @return pageId
     */
    public String getPageId() {
        return this.pageId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return updateUser
     */
    public String getUpdateUser() {
        return this.updateUser;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return urlType
     */
    public Integer getUrlType() {
        return this.urlType;
    }

    public static final class Builder extends Request.Builder<SyncInfoRequest, Builder> {
        private String accountNo; 
        private String bizId; 
        private String chainValue; 
        private String componentIdList; 
        private String createUser; 
        private Long id; 
        private Long mainId; 
        private String name; 
        private String nextChainValue; 
        private String ossFileUrl; 
        private String pageId; 
        private Integer status; 
        private String updateUser; 
        private String url; 
        private Integer urlType; 

        private Builder() {
            super();
        } 

        private Builder(SyncInfoRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.bizId = request.bizId;
            this.chainValue = request.chainValue;
            this.componentIdList = request.componentIdList;
            this.createUser = request.createUser;
            this.id = request.id;
            this.mainId = request.mainId;
            this.name = request.name;
            this.nextChainValue = request.nextChainValue;
            this.ossFileUrl = request.ossFileUrl;
            this.pageId = request.pageId;
            this.status = request.status;
            this.updateUser = request.updateUser;
            this.url = request.url;
            this.urlType = request.urlType;
        } 

        /**
         * AccountNo.
         */
        public Builder accountNo(String accountNo) {
            this.putQueryParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ChainValue.
         */
        public Builder chainValue(String chainValue) {
            this.putQueryParameter("ChainValue", chainValue);
            this.chainValue = chainValue;
            return this;
        }

        /**
         * ComponentIdList.
         */
        public Builder componentIdList(String componentIdList) {
            this.putQueryParameter("ComponentIdList", componentIdList);
            this.componentIdList = componentIdList;
            return this;
        }

        /**
         * CreateUser.
         */
        public Builder createUser(String createUser) {
            this.putQueryParameter("CreateUser", createUser);
            this.createUser = createUser;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MainId.
         */
        public Builder mainId(Long mainId) {
            this.putQueryParameter("MainId", mainId);
            this.mainId = mainId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NextChainValue.
         */
        public Builder nextChainValue(String nextChainValue) {
            this.putQueryParameter("NextChainValue", nextChainValue);
            this.nextChainValue = nextChainValue;
            return this;
        }

        /**
         * OssFileUrl.
         */
        public Builder ossFileUrl(String ossFileUrl) {
            this.putQueryParameter("OssFileUrl", ossFileUrl);
            this.ossFileUrl = ossFileUrl;
            return this;
        }

        /**
         * PageId.
         */
        public Builder pageId(String pageId) {
            this.putQueryParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UpdateUser.
         */
        public Builder updateUser(String updateUser) {
            this.putQueryParameter("UpdateUser", updateUser);
            this.updateUser = updateUser;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * UrlType.
         */
        public Builder urlType(Integer urlType) {
            this.putQueryParameter("UrlType", urlType);
            this.urlType = urlType;
            return this;
        }

        @Override
        public SyncInfoRequest build() {
            return new SyncInfoRequest(this);
        } 

    } 

}
