// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link UpdateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourceRequest</p>
 */
public class UpdateDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionInfo")
    private String connectionInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Credential")
    private String credential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Exclude")
    private String exclude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Include")
    private String include;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexLevel")
    private String indexLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private java.util.List<String> path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schedule")
    private String schedule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeedLimit")
    private String speedLimit;

    private UpdateDataSourceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.connectionInfo = builder.connectionInfo;
        this.credential = builder.credential;
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceName = builder.dataSourceName;
        this.exclude = builder.exclude;
        this.include = builder.include;
        this.indexLevel = builder.indexLevel;
        this.options = builder.options;
        this.path = builder.path;
        this.schedule = builder.schedule;
        this.speedLimit = builder.speedLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return connectionInfo
     */
    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * @return credential
     */
    public String getCredential() {
        return this.credential;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return exclude
     */
    public String getExclude() {
        return this.exclude;
    }

    /**
     * @return include
     */
    public String getInclude() {
        return this.include;
    }

    /**
     * @return indexLevel
     */
    public String getIndexLevel() {
        return this.indexLevel;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return path
     */
    public java.util.List<String> getPath() {
        return this.path;
    }

    /**
     * @return schedule
     */
    public String getSchedule() {
        return this.schedule;
    }

    /**
     * @return speedLimit
     */
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    public static final class Builder extends Request.Builder<UpdateDataSourceRequest, Builder> {
        private String clusterId; 
        private String connectionInfo; 
        private String credential; 
        private String dataSourceId; 
        private String dataSourceName; 
        private String exclude; 
        private String include; 
        private String indexLevel; 
        private String options; 
        private java.util.List<String> path; 
        private String schedule; 
        private String speedLimit; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.connectionInfo = request.connectionInfo;
            this.credential = request.credential;
            this.dataSourceId = request.dataSourceId;
            this.dataSourceName = request.dataSourceName;
            this.exclude = request.exclude;
            this.include = request.include;
            this.indexLevel = request.indexLevel;
            this.options = request.options;
            this.path = request.path;
            this.schedule = request.schedule;
            this.speedLimit = request.speedLimit;
        } 

        /**
         * <p>The ID of the client group used to access the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000**************hg9</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The connection information for the data source. Examples:</p>
         * <ul>
         * <li><p>On-premises NAS data source:
         * {
         * &quot;dataServerAddresses&quot;: [
         * {
         * &quot;host&quot;: &quot;123.123.123.123&quot;,
         * &quot;port&quot;: &quot;8080&quot;
         * }
         * ],
         * &quot;sharePath&quot;: &quot;/share&quot;,
         * &quot;mountOptions&quot;: &quot;vers=3&quot;,
         * &quot;fileSystemType&quot;: &quot;nfs&quot;
         * }</p>
         * </li>
         * <li><p>Intelligent Computing CPFS data source:
         * {&quot;vpcMountTarget&quot;:&quot;cpfs-010wn\<em>\</em>\<em>wy-vpc-ta\</em>\*\*8.cn-shanghai.cpfs.aliyuncs.com&quot;,&quot;sharePath&quot;:&quot;/&quot;}</p>
         * </li>
         * <li><p>Other large-scale file system data sources:
         * {&quot;path&quot;:&quot;/mnt&quot;}</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;dataServerAddresses&quot;: [
         *         {
         *             &quot;host&quot;: &quot;123.123.123.123&quot;,
         *             &quot;port&quot;: &quot;8080&quot;
         *         }
         *     ],
         *     &quot;sharePath&quot;: &quot;/share&quot;,
         *     &quot;mountOptions&quot;: &quot;vers=3&quot;,
         *     &quot;fileSystemType&quot;: &quot;nfs&quot;
         * }</p>
         */
        public Builder connectionInfo(String connectionInfo) {
            this.putQueryParameter("ConnectionInfo", connectionInfo);
            this.connectionInfo = connectionInfo;
            return this;
        }

        /**
         * <p>The access credentials for the data source. This parameter is used for on-premises NAS data sources that use the SMB protocol, and for OSS and S3 protocol-compatible data sources. Examples:</p>
         * <ul>
         * <li><p>On-premises NAS data source (SMB protocol):
         * {
         * &quot;mountUsername&quot;: &quot;\<em>\</em>\<em>\</em>\<em>&quot;,
         * &quot;mountPassword&quot;: &quot;\</em>\<em>\</em>\<em>\</em>&quot;
         * }</p>
         * </li>
         * <li><p>OSS protocol-compatible data source/S3 protocol-compatible data source:
         * {
         * &quot;accessKeyId&quot;: &quot;\<em>\</em>\<em>\</em>\<em>&quot;,
         * &quot;accessKeySecret&quot;: &quot;\</em>\<em>\</em>\<em>\</em>&quot;
         * }</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mountUsername&quot;:&quot;<em><strong>&quot;,&quot;mountPassword&quot;:&quot;</strong></em>&quot;}</p>
         */
        public Builder credential(String credential) {
            this.putQueryParameter("Credential", credential);
            this.credential = credential;
            return this;
        }

        /**
         * <p>The ID of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-0006xo****dtle</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>MyLocalNas</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>A filter to specify which files to exclude. This parameter applies only to the archive feature.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/home/alice/log/&quot;]</p>
         */
        public Builder exclude(String exclude) {
            this.putQueryParameter("Exclude", exclude);
            this.exclude = exclude;
            return this;
        }

        /**
         * <p>A filter to specify which files to include. This parameter applies only to the archive feature.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/home/alice/&quot;, &quot;/home/bob/&quot;]</p>
         */
        public Builder include(String include) {
            this.putQueryParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * <p>The index level for data source analysis. This parameter applies only to the archive feature.</p>
         * <ul>
         * <li><p>OFF: No index is created.</p>
         * </li>
         * <li><p>META: A metadata index is created.</p>
         * </li>
         * <li><p>ALL: A full-text index is created. (Deprecated)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>META</p>
         */
        public Builder indexLevel(String indexLevel) {
            this.putQueryParameter("IndexLevel", indexLevel);
            this.indexLevel = indexLevel;
            return this;
        }

        /**
         * <p>The options for data source analysis. This parameter applies only to the archive feature.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>A list of paths for data source analysis. This parameter applies only to the archive feature.</p>
         */
        public Builder path(java.util.List<String> path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The schedule for data source analysis. This parameter applies only to the archive feature. The format is <code>I|{startTime}|{interval}</code>. This specifies a task that starts at <code>{startTime}</code> and repeats at the specified <code>{interval}</code>. <code>startTime</code> is a Unix time value in seconds. <code>interval</code> is an ISO 8601 time interval. For example, <code>PT1H</code> indicates a one-hour interval, and <code>P1D</code> indicates a one-day interval.</p>
         * 
         * <strong>example:</strong>
         * <p>I|1729493847|P1D</p>
         */
        public Builder schedule(String schedule) {
            this.putQueryParameter("Schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        /**
         * <p>The rate limiting configuration for data source analysis. This parameter applies only to the archive feature.</p>
         * 
         * <strong>example:</strong>
         * <p>0:24:102400</p>
         */
        public Builder speedLimit(String speedLimit) {
            this.putQueryParameter("SpeedLimit", speedLimit);
            this.speedLimit = speedLimit;
            return this;
        }

        @Override
        public UpdateDataSourceRequest build() {
            return new UpdateDataSourceRequest(this);
        } 

    } 

}
