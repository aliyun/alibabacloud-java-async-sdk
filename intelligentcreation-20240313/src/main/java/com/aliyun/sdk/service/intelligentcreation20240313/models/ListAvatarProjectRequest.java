// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListAvatarProjectRequest} extends {@link RequestModel}
 *
 * <p>ListAvatarProjectRequest</p>
 */
public class ListAvatarProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("projectIdList")
    private java.util.List<String> projectIdList;

    private ListAvatarProjectRequest(Builder builder) {
        super(builder);
        this.projectIdList = builder.projectIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvatarProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectIdList
     */
    public java.util.List<String> getProjectIdList() {
        return this.projectIdList;
    }

    public static final class Builder extends Request.Builder<ListAvatarProjectRequest, Builder> {
        private java.util.List<String> projectIdList; 

        private Builder() {
            super();
        } 

        private Builder(ListAvatarProjectRequest request) {
            super(request);
            this.projectIdList = request.projectIdList;
        } 

        /**
         * projectIdList.
         */
        public Builder projectIdList(java.util.List<String> projectIdList) {
            String projectIdListShrink = shrink(projectIdList, "projectIdList", "simple");
            this.putQueryParameter("projectIdList", projectIdListShrink);
            this.projectIdList = projectIdList;
            return this;
        }

        @Override
        public ListAvatarProjectRequest build() {
            return new ListAvatarProjectRequest(this);
        } 

    } 

}
