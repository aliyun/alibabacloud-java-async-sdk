// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseContactQueryPageListRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseContactQueryPageListRequest</p>
 */
public class EnterpriseContactQueryPageListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrivateContact")
    private Boolean privateContact;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SharedContact")
    private Boolean sharedContact;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowCompleteInfo")
    private Boolean showCompleteInfo;

    private EnterpriseContactQueryPageListRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.privateContact = builder.privateContact;
        this.query = builder.query;
        this.sharedContact = builder.sharedContact;
        this.showCompleteInfo = builder.showCompleteInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseContactQueryPageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return orientedEcId
     */
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    /**
     * @return orientedLeId
     */
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    /**
     * @return orientedNbId
     */
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return privateContact
     */
    public Boolean getPrivateContact() {
        return this.privateContact;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sharedContact
     */
    public Boolean getSharedContact() {
        return this.sharedContact;
    }

    /**
     * @return showCompleteInfo
     */
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    public static final class Builder extends Request.Builder<EnterpriseContactQueryPageListRequest, Builder> {
        private String appName; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Boolean privateContact; 
        private String query; 
        private Boolean sharedContact; 
        private Boolean showCompleteInfo; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseContactQueryPageListRequest request) {
            super(request);
            this.appName = request.appName;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.privateContact = request.privateContact;
            this.query = request.query;
            this.sharedContact = request.sharedContact;
            this.showCompleteInfo = request.showCompleteInfo;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * OrientedEcId.
         */
        public Builder orientedEcId(String orientedEcId) {
            this.putBodyParameter("OrientedEcId", orientedEcId);
            this.orientedEcId = orientedEcId;
            return this;
        }

        /**
         * OrientedLeId.
         */
        public Builder orientedLeId(String orientedLeId) {
            this.putBodyParameter("OrientedLeId", orientedLeId);
            this.orientedLeId = orientedLeId;
            return this;
        }

        /**
         * OrientedNbId.
         */
        public Builder orientedNbId(String orientedNbId) {
            this.putBodyParameter("OrientedNbId", orientedNbId);
            this.orientedNbId = orientedNbId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PrivateContact.
         */
        public Builder privateContact(Boolean privateContact) {
            this.putBodyParameter("PrivateContact", privateContact);
            this.privateContact = privateContact;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * SharedContact.
         */
        public Builder sharedContact(Boolean sharedContact) {
            this.putBodyParameter("SharedContact", sharedContact);
            this.sharedContact = sharedContact;
            return this;
        }

        /**
         * ShowCompleteInfo.
         */
        public Builder showCompleteInfo(Boolean showCompleteInfo) {
            this.putQueryParameter("ShowCompleteInfo", showCompleteInfo);
            this.showCompleteInfo = showCompleteInfo;
            return this;
        }

        @Override
        public EnterpriseContactQueryPageListRequest build() {
            return new EnterpriseContactQueryPageListRequest(this);
        } 

    } 

}
