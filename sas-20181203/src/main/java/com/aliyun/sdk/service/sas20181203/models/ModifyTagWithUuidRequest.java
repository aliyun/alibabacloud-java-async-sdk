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
 * {@link ModifyTagWithUuidRequest} extends {@link RequestModel}
 *
 * <p>ModifyTagWithUuidRequest</p>
 */
public class ModifyTagWithUuidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineTypes")
    private String machineTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private String uuidList;

    private ModifyTagWithUuidRequest(Builder builder) {
        super(builder);
        this.machineTypes = builder.machineTypes;
        this.tagId = builder.tagId;
        this.tagList = builder.tagList;
        this.target = builder.target;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTagWithUuidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    /**
     * @return tagList
     */
    public String getTagList() {
        return this.tagList;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return uuidList
     */
    public String getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ModifyTagWithUuidRequest, Builder> {
        private String machineTypes; 
        private String tagId; 
        private String tagList; 
        private String target; 
        private String uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTagWithUuidRequest request) {
            super(request);
            this.machineTypes = request.machineTypes;
            this.tagId = request.tagId;
            this.tagList = request.tagList;
            this.target = request.target;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The type of the asset to query. If you do not specify this parameter, the tags of all asset types are queried. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: server</li>
         * <li><strong>cloud_product</strong>: Alibaba Cloud service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * <p>The ID of the tag that you want to manage.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeGroupedTags~~">DescribeGroupedTags</a> operation to query the IDs of tags.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3897941</p>
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * <p>The names of the tags that you want to manage. Separate multiple tag names with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeGroupedTags~~">DescribeGroupedTags</a> operation to query the names of tags.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac,ad</p>
         */
        public Builder tagList(String tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>The details of the server for which you want to manage the tag. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>Target</strong>: the UUID of the server that you want to add or remove.</p>
         * </li>
         * <li><p><strong>targetType</strong>: the method by which the server is added. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: by server</li>
         * <li><strong>groupId</strong>: by server group</li>
         * </ul>
         * </li>
         * <li><p><strong>flag</strong>: the operation that you want to perform on the server. Valid values:</p>
         * <ul>
         * <li><strong>del</strong>: removes the tag from the server.</li>
         * <li><strong>add</strong>: adds the tag to the server.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;target&quot;:&quot;inet-7c676676-06fa-442e-90fb-b802e5d6****&quot;,&quot;targetType&quot;:&quot;uuid&quot;,&quot;flag&quot;:&quot;add&quot;}]</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The UUIDs of the servers.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>e2737dc3-78f4-4653-a986-dc5fad4b****,c189f0e3-df22-42d5-a73d-02c05667****</p>
         */
        public Builder uuidList(String uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ModifyTagWithUuidRequest build() {
            return new ModifyTagWithUuidRequest(this);
        } 

    } 

}
