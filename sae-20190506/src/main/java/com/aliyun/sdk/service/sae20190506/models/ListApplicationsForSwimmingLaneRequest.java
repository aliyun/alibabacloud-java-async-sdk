// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListApplicationsForSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsForSwimmingLaneRequest</p>
 */
public class ListApplicationsForSwimmingLaneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private ListApplicationsForSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.namespaceId = builder.namespaceId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForSwimmingLaneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListApplicationsForSwimmingLaneRequest, Builder> {
        private Long groupId; 
        private String namespaceId; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsForSwimmingLaneRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.namespaceId = request.namespaceId;
            this.tag = request.tag;
        } 

        /**
         * <p>The ID of the application group. You can call the <a href="https://help.aliyun.com/document_detail/126249.html">DescribeApplicationGroups</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of a namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The canary tag</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;alicloud.service.tag&quot;:&quot;gray&quot;}</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListApplicationsForSwimmingLaneRequest build() {
            return new ListApplicationsForSwimmingLaneRequest(this);
        } 

    } 

}
