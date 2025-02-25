// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListWaitingChatsRequest} extends {@link RequestModel}
 *
 * <p>ListWaitingChatsRequest</p>
 */
public class ListWaitingChatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupIdList")
    private String skillGroupIdList;

    private ListWaitingChatsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillGroupIdList = builder.skillGroupIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWaitingChatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return skillGroupIdList
     */
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public static final class Builder extends Request.Builder<ListWaitingChatsRequest, Builder> {
        private String instanceId; 
        private String skillGroupIdList; 

        private Builder() {
            super();
        } 

        private Builder(ListWaitingChatsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.skillGroupIdList = request.skillGroupIdList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SkillGroupIdList.
         */
        public Builder skillGroupIdList(String skillGroupIdList) {
            this.putQueryParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }

        @Override
        public ListWaitingChatsRequest build() {
            return new ListWaitingChatsRequest(this);
        } 

    } 

}
