// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryEdgeDriverVersionRequest} extends {@link RequestModel}
 *
 * <p>QueryEdgeDriverVersionRequest</p>
 */
public class QueryEdgeDriverVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverVersion")
    private String driverVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionState")
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
         * <p>The number of the page to return. Pages start from Page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Drivers</strong> page, move the pointer over the name of the driver whose versions you want to query and obtain the driver ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/155776.html">QueryEdgeDriver</a> operation to query the driver ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fec565038d7544978d9aed5c1a******</p>
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * <p>The version number of the driver. To query information about a specific driver version, set this parameter to the specific version number.</p>
         */
        public Builder driverVersion(String driverVersion) {
            this.putQueryParameter("DriverVersion", driverVersion);
            this.driverVersion = driverVersion;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 30. Default value: 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the driver version. Valid values:</p>
         * <ul>
         * <li>0: The driver version to be queried is not published.</li>
         * <li>1: The driver version to be queried is published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
