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
 * {@link CreateLiveMessageGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveMessageGroupRequest</p>
 */
public class CreateLiveMessageGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Administrators")
    private java.util.List<String> administrators;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

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
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private CreateLiveMessageGroupRequest(Builder builder) {
        super(builder);
        this.administrators = builder.administrators;
        this.appId = builder.appId;
        this.creatorId = builder.creatorId;
        this.dataCenter = builder.dataCenter;
        this.groupId = builder.groupId;
        this.groupInfo = builder.groupInfo;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveMessageGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return administrators
     */
    public java.util.List<String> getAdministrators() {
        return this.administrators;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<CreateLiveMessageGroupRequest, Builder> {
        private java.util.List<String> administrators; 
        private String appId; 
        private String creatorId; 
        private String dataCenter; 
        private String groupId; 
        private String groupInfo; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveMessageGroupRequest request) {
            super(request);
            this.administrators = request.administrators;
            this.appId = request.appId;
            this.creatorId = request.creatorId;
            this.dataCenter = request.dataCenter;
            this.groupId = request.groupId;
            this.groupInfo = request.groupInfo;
            this.groupName = request.groupName;
        } 

        /**
         * <p>The list of administrators.</p>
         */
        public Builder administrators(java.util.List<String> administrators) {
            String administratorsShrink = shrink(administrators, "Administrators", "simple");
            this.putQueryParameter("Administrators", administratorsShrink);
            this.administrators = administrators;
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
         * <p>The ID of the group creator. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        public Builder creatorId(String creatorId) {
            this.putQueryParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2593195.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
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
         * <p>The ID of the group that you want to create. The group ID must be unique within your business. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
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
         * <p>The additional information about the group. The value can be up to 32 KB in length.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroupinfo</p>
         */
        public Builder groupInfo(String groupInfo) {
            this.putQueryParameter("GroupInfo", groupInfo);
            this.groupInfo = groupInfo;
            return this;
        }

        /**
         * <p>The name of the group. The name can be up to 128 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>mytestgroup</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public CreateLiveMessageGroupRequest build() {
            return new CreateLiveMessageGroupRequest(this);
        } 

    } 

}
