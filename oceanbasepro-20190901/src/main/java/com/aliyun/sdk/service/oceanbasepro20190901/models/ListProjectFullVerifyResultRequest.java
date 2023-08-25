// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectFullVerifyResultRequest} extends {@link RequestModel}
 *
 * <p>ListProjectFullVerifyResultRequest</p>
 */
public class ListProjectFullVerifyResultRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DestSchemas")
    private java.util.List < String > destSchemas;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 150, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("SourceSchemas")
    private java.util.List < String > sourceSchemas;

    @Body
    @NameInMap("Status")
    private String status;

    private ListProjectFullVerifyResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destSchemas = builder.destSchemas;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sourceSchemas = builder.sourceSchemas;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectFullVerifyResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return destSchemas
     */
    public java.util.List < String > getDestSchemas() {
        return this.destSchemas;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return sourceSchemas
     */
    public java.util.List < String > getSourceSchemas() {
        return this.sourceSchemas;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListProjectFullVerifyResultRequest, Builder> {
        private String regionId; 
        private java.util.List < String > destSchemas; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private java.util.List < String > sourceSchemas; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectFullVerifyResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destSchemas = request.destSchemas;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sourceSchemas = request.sourceSchemas;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DestSchemas.
         */
        public Builder destSchemas(java.util.List < String > destSchemas) {
            String destSchemasShrink = shrink(destSchemas, "DestSchemas", "json");
            this.putBodyParameter("DestSchemas", destSchemasShrink);
            this.destSchemas = destSchemas;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * SourceSchemas.
         */
        public Builder sourceSchemas(java.util.List < String > sourceSchemas) {
            String sourceSchemasShrink = shrink(sourceSchemas, "SourceSchemas", "json");
            this.putBodyParameter("SourceSchemas", sourceSchemasShrink);
            this.sourceSchemas = sourceSchemas;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListProjectFullVerifyResultRequest build() {
            return new ListProjectFullVerifyResultRequest(this);
        } 

    } 

}
