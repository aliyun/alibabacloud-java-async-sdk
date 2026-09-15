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
 * {@link DescribeExposedStatisticsDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedStatisticsDetailRequest</p>
 */
public class DescribeExposedStatisticsDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private String criteria;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExposureIp")
    private String exposureIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statisticsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsTypeGatewayType")
    private String statisticsTypeGatewayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsTypeInstanceValue")
    private String statisticsTypeInstanceValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribeExposedStatisticsDetailRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.exposureIp = builder.exposureIp;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.statisticsType = builder.statisticsType;
        this.statisticsTypeGatewayType = builder.statisticsTypeGatewayType;
        this.statisticsTypeInstanceValue = builder.statisticsTypeInstanceValue;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedStatisticsDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return exposureIp
     */
    public String getExposureIp() {
        return this.exposureIp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return statisticsType
     */
    public String getStatisticsType() {
        return this.statisticsType;
    }

    /**
     * @return statisticsTypeGatewayType
     */
    public String getStatisticsTypeGatewayType() {
        return this.statisticsTypeGatewayType;
    }

    /**
     * @return statisticsTypeInstanceValue
     */
    public String getStatisticsTypeInstanceValue() {
        return this.statisticsTypeInstanceValue;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeExposedStatisticsDetailRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private String exposureIp; 
        private String instanceId; 
        private Integer pageSize; 
        private Long resourceDirectoryAccountId; 
        private String statisticsType; 
        private String statisticsTypeGatewayType; 
        private String statisticsTypeInstanceValue; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExposedStatisticsDetailRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.exposureIp = request.exposureIp;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.statisticsType = request.statisticsType;
            this.statisticsTypeGatewayType = request.statisticsTypeGatewayType;
            this.statisticsTypeInstanceValue = request.statisticsTypeInstanceValue;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * <p>The page number of the current page in a paged query.</p>
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
         * <p>The public IP address that is exposed on the Internet for the asset to query.</p>
         * 
         * <strong>example:</strong>
         * <p>116.12.XX.XX</p>
         */
        public Builder exposureIp(String exposureIp) {
            this.putQueryParameter("ExposureIp", exposureIp);
            this.exposureIp = exposureIp;
            return this;
        }

        /**
         * <p>The instance ID of the asset to query.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1g6wxdwps7s9dz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page in a paged query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
         * <blockquote>
         * <p>Set PageSize to a non-empty value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1232428423234****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The type of statistics to query. Valid values:</p>
         * <ul>
         * <li><strong>exposureType</strong>: gateway assets exposed on the Internet.</li>
         * <li><strong>exposurePort</strong>: ports exposed on the Internet.</li>
         * <li><strong>exposureComponent</strong>: system components exposed on the Internet.</li>
         * <li><strong>exposureIp</strong>: IP addresses exposed on the Internet.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exposureType</p>
         */
        public Builder statisticsType(String statisticsType) {
            this.putQueryParameter("StatisticsType", statisticsType);
            this.statisticsType = statisticsType;
            return this;
        }

        /**
         * <p>The Asset Type of the gateway to query. This parameter takes effect only when <strong>StatisticsType</strong> is set to <strong>exposureType</strong>. Valid values:</p>
         * <ul>
         * <li><strong>SLB</strong>: public IP address of a load balancing SLB instance.</li>
         * <li><strong>DNAT</strong>: NAT gateway that uses the DNAT feature to connect to the Internet.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLB</p>
         */
        public Builder statisticsTypeGatewayType(String statisticsTypeGatewayType) {
            this.putQueryParameter("StatisticsTypeGatewayType", statisticsTypeGatewayType);
            this.statisticsTypeGatewayType = statisticsTypeGatewayType;
            return this;
        }

        /**
         * <p>The instance ID of the gateway to query. This parameter takes effect only when <strong>StatisticsType</strong> is set to <strong>exposureType</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2ze4rso39h4nczcqs****</p>
         */
        public Builder statisticsTypeInstanceValue(String statisticsTypeInstanceValue) {
            this.putQueryParameter("StatisticsTypeInstanceValue", statisticsTypeInstanceValue);
            this.statisticsTypeInstanceValue = statisticsTypeInstanceValue;
            return this;
        }

        /**
         * <p>The UUID of the server to query.</p>
         * 
         * <strong>example:</strong>
         * <p>c9107c04-942f-40c1-981a-f1c1***</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeExposedStatisticsDetailRequest build() {
            return new DescribeExposedStatisticsDetailRequest(this);
        } 

    } 

}
