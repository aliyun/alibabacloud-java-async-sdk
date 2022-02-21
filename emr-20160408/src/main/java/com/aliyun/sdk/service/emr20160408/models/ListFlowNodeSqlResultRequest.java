// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowNodeSqlResultRequest} extends {@link RequestModel}
 *
 * <p>ListFlowNodeSqlResultRequest</p>
 */
public class ListFlowNodeSqlResultRequest extends Request {
    @Query
    @NameInMap("Length")
    private Integer length;

    @Query
    @NameInMap("NodeInstanceId")
    @Validation(required = true)
    private String nodeInstanceId;

    @Query
    @NameInMap("Offset")
    private Integer offset;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SqlIndex")
    private Integer sqlIndex;

    private ListFlowNodeSqlResultRequest(Builder builder) {
        super(builder);
        this.length = builder.length;
        this.nodeInstanceId = builder.nodeInstanceId;
        this.offset = builder.offset;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.sqlIndex = builder.sqlIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowNodeSqlResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return nodeInstanceId
     */
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sqlIndex
     */
    public Integer getSqlIndex() {
        return this.sqlIndex;
    }

    public static final class Builder extends Request.Builder<ListFlowNodeSqlResultRequest, Builder> {
        private Integer length; 
        private String nodeInstanceId; 
        private Integer offset; 
        private String projectId; 
        private String regionId; 
        private Integer sqlIndex; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowNodeSqlResultRequest response) {
            super(response);
            this.length = response.length;
            this.nodeInstanceId = response.nodeInstanceId;
            this.offset = response.offset;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.sqlIndex = response.sqlIndex;
        } 

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * NodeInstanceId.
         */
        public Builder nodeInstanceId(String nodeInstanceId) {
            this.putQueryParameter("NodeInstanceId", nodeInstanceId);
            this.nodeInstanceId = nodeInstanceId;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SqlIndex.
         */
        public Builder sqlIndex(Integer sqlIndex) {
            this.putQueryParameter("SqlIndex", sqlIndex);
            this.sqlIndex = sqlIndex;
            return this;
        }

        @Override
        public ListFlowNodeSqlResultRequest build() {
            return new ListFlowNodeSqlResultRequest(this);
        } 

    } 

}
