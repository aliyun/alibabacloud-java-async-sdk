// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeDriverVersionRequest} extends {@link RequestModel}
 *
 * <p>QueryEdgeDriverVersionRequest</p>
 */
public class QueryEdgeDriverVersionRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("DriverId")
    @Validation(required = true)
    private String driverId;

    @Query
    @NameInMap("DriverVersion")
    private String driverVersion;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("VersionState")
    private Integer versionState;

    private QueryEdgeDriverVersionRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.driverId = builder.driverId;
        this.driverVersion = builder.driverVersion;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.versionState = builder.versionState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeDriverVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return driverId
     */
    public String getDriverId() {
        return this.driverId;
    }

    /**
     * @return driverVersion
     */
    public String getDriverVersion() {
        return this.driverVersion;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return versionState
     */
    public Integer getVersionState() {
        return this.versionState;
    }

    public static final class Builder extends Request.Builder<QueryEdgeDriverVersionRequest, Builder> {
        private Integer currentPage; 
        private String driverId; 
        private String driverVersion; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private Integer versionState; 

        private Builder() {
            super();
        } 

        private Builder(QueryEdgeDriverVersionRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.driverId = request.driverId;
            this.driverVersion = request.driverVersion;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.versionState = request.versionState;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DriverId.
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * DriverVersion.
         */
        public Builder driverVersion(String driverVersion) {
            this.putQueryParameter("DriverVersion", driverVersion);
            this.driverVersion = driverVersion;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * VersionState.
         */
        public Builder versionState(Integer versionState) {
            this.putQueryParameter("VersionState", versionState);
            this.versionState = versionState;
            return this;
        }

        @Override
        public QueryEdgeDriverVersionRequest build() {
            return new QueryEdgeDriverVersionRequest(this);
        } 

    } 

}
