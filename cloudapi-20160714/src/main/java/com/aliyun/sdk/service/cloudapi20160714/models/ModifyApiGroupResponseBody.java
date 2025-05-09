// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ModifyApiGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyApiGroupResponseBody</p>
 */
public class ModifyApiGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasePath")
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private String subDomain;

    private ModifyApiGroupResponseBody(Builder builder) {
        this.basePath = builder.basePath;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.requestId = builder.requestId;
        this.subDomain = builder.subDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    public static final class Builder {
        private String basePath; 
        private String description; 
        private String groupId; 
        private String groupName; 
        private String requestId; 
        private String subDomain; 

        private Builder() {
        } 

        private Builder(ModifyApiGroupResponseBody model) {
            this.basePath = model.basePath;
            this.description = model.description;
            this.groupId = model.groupId;
            this.groupName = model.groupName;
            this.requestId = model.requestId;
            this.subDomain = model.subDomain;
        } 

        /**
         * <p>The root path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * <p>The description of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>New weather informations.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the group to which an API belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>NewWeather</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4CF287C6-CE5B-477B-BE27-C48F99EADBC8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The second-level domain name automatically assigned to the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>523e8dc7bbe04613b5b1d726c2a7889d-cn-hangzhou.alicloudapi.com</p>
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        public ModifyApiGroupResponseBody build() {
            return new ModifyApiGroupResponseBody(this);
        } 

    } 

}
