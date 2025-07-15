// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ModifyLiveMessageGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyLiveMessageGroupRequest</p>
 */
public class ModifyLiveMessageGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminList")
    private java.util.List<String> adminList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupInfo")
    private String groupInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyAdmin")
    private Boolean modifyAdmin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyInfo")
    private Boolean modifyInfo;

    private ModifyLiveMessageGroupRequest(Builder builder) {
        super(builder);
        this.adminList = builder.adminList;
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.groupId = builder.groupId;
        this.groupInfo = builder.groupInfo;
        this.modifyAdmin = builder.modifyAdmin;
        this.modifyInfo = builder.modifyInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminList
     */
    public java.util.List<String> getAdminList() {
        return this.adminList;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupInfo
     */
    public String getGroupInfo() {
        return this.groupInfo;
    }

    /**
     * @return modifyAdmin
     */
    public Boolean getModifyAdmin() {
        return this.modifyAdmin;
    }

    /**
     * @return modifyInfo
     */
    public Boolean getModifyInfo() {
        return this.modifyInfo;
    }

    public static final class Builder extends Request.Builder<ModifyLiveMessageGroupRequest, Builder> {
        private java.util.List<String> adminList; 
        private String appId; 
        private String dataCenter; 
        private String groupId; 
        private String groupInfo; 
        private Boolean modifyAdmin; 
        private Boolean modifyInfo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLiveMessageGroupRequest request) {
            super(request);
            this.adminList = request.adminList;
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
            this.groupId = request.groupId;
            this.groupInfo = request.groupInfo;
            this.modifyAdmin = request.modifyAdmin;
            this.modifyInfo = request.modifyInfo;
        } 

        /**
         * <p>The list of administrators after your change.</p>
         */
        public Builder adminList(java.util.List<String> adminList) {
            String adminListShrink = shrink(adminList, "AdminList", "simple");
            this.putQueryParameter("AdminList", adminListShrink);
            this.adminList = adminList;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putQueryParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The additional information about the group after the modification. The value can be up to 32 KB in length.</p>
         * 
         * <strong>example:</strong>
         * <p>newmeta</p>
         */
        public Builder groupInfo(String groupInfo) {
            this.putQueryParameter("GroupInfo", groupInfo);
            this.groupInfo = groupInfo;
            return this;
        }

        /**
         * <p>Specifies whether to change the group administrators.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder modifyAdmin(Boolean modifyAdmin) {
            this.putQueryParameter("ModifyAdmin", modifyAdmin);
            this.modifyAdmin = modifyAdmin;
            return this;
        }

        /**
         * <p>Specifies whether to modify the additional information about the group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder modifyInfo(Boolean modifyInfo) {
            this.putQueryParameter("ModifyInfo", modifyInfo);
            this.modifyInfo = modifyInfo;
            return this;
        }

        @Override
        public ModifyLiveMessageGroupRequest build() {
            return new ModifyLiveMessageGroupRequest(this);
        } 

    } 

}
