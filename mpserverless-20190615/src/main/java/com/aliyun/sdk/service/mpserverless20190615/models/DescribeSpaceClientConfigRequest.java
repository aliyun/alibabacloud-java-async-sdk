// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpaceClientConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeSpaceClientConfigRequest</p>
 */
public class DescribeSpaceClientConfigRequest extends Request {
    @Body
    @NameInMap("Detail")
    private String detail;

    @Body
    @NameInMap("SpaceId")
    private String spaceId;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(minimum = 1)
    private Long workspaceId;

    private DescribeSpaceClientConfigRequest(Builder builder) {
        super(builder);
        this.detail = builder.detail;
        this.spaceId = builder.spaceId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpaceClientConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeSpaceClientConfigRequest, Builder> {
        private String detail; 
        private String spaceId; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpaceClientConfigRequest request) {
            super(request);
            this.detail = request.detail;
            this.spaceId = request.spaceId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.putBodyParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DescribeSpaceClientConfigRequest build() {
            return new DescribeSpaceClientConfigRequest(this);
        } 

    } 

}
