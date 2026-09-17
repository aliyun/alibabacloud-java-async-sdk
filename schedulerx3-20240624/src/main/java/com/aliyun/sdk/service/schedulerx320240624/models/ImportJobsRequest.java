// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ImportJobsRequest} extends {@link RequestModel}
 *
 * <p>ImportJobsRequest</p>
 */
public class ImportJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoCreateApp")
    private Boolean autoCreateApp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    private Boolean overwrite;

    private ImportJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoCreateApp = builder.autoCreateApp;
        this.clusterId = builder.clusterId;
        this.content = builder.content;
        this.overwrite = builder.overwrite;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportJobsRequest create() {
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
     * @return autoCreateApp
     */
    public Boolean getAutoCreateApp() {
        return this.autoCreateApp;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public static final class Builder extends Request.Builder<ImportJobsRequest, Builder> {
        private String regionId; 
        private Boolean autoCreateApp; 
        private String clusterId; 
        private String content; 
        private Boolean overwrite; 

        private Builder() {
            super();
        } 

        private Builder(ImportJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoCreateApp = request.autoCreateApp;
            this.clusterId = request.clusterId;
            this.content = request.content;
            this.overwrite = request.overwrite;
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
         * <p>Determines whether to automatically create the Application if it does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoCreateApp(Boolean autoCreateApp) {
            this.putBodyParameter("AutoCreateApp", autoCreateApp);
            this.autoCreateApp = autoCreateApp;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The jobs to import, formatted as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;kind&quot;: &quot;SchedulerXJobs&quot;,
         *   &quot;type&quot;: &quot;JSON&quot;,
         *   &quot;version&quot;: &quot;2.0&quot;,
         *   &quot;content&quot;: [
         *     {
         *       &quot;appName&quot;: &quot;xxl-job-executor-perf-test-xx&quot;,
         *       &quot;groupId&quot;: &quot;xxl-job-executor-perf-test-xx&quot;,
         *       &quot;description&quot;: &quot;xxl-job-executor-xx&quot;,
         *       &quot;jobConfigInfo&quot;: [
         *         {
         *           &quot;jobHandler&quot;: &quot;testJobVoidHandler&quot;,
         *           &quot;dataOffset&quot;: 0,
         *           &quot;executeMode&quot;: &quot;standalone&quot;,
         *           &quot;monitorConfigInfo&quot;: {
         *             &quot;alarmType&quot;: &quot;CustomContacts&quot;,
         *             &quot;failLimitTimes&quot;: 1,
         *             &quot;failEnable&quot;: true,
         *             &quot;failRate&quot;: 100,
         *             &quot;timeoutKillEnable&quot;: false,
         *             &quot;missWorkerEnable&quot;: false,
         *             &quot;sendChannel&quot;: &quot;webhook&quot;,
         *             &quot;timeoutEnable&quot;: true,
         *             &quot;timeout&quot;: 7200,
         *             &quot;daysOfDeadline&quot;: 0,
         *             &quot;successNotice&quot;: false
         *           },
         *           &quot;attemptInterval&quot;: 30,
         *           &quot;cleanMode&quot;: &quot;{\&quot;cleanMode\&quot;:\&quot;NUM_ONLY\&quot;,\&quot;totalRemain\&quot;:300}&quot;,
         *           &quot;description&quot;: &quot;&quot;,
         *           &quot;routeStrategy&quot;: 1,
         *           &quot;userName&quot;: &quot;xx&quot;,
         *           &quot;userId&quot;: &quot;xx&quot;,
         *           &quot;content&quot;: &quot;{\&quot;jobHandler\&quot;:\&quot;testJobVoidHandler\&quot;}&quot;,
         *           &quot;maxConcurrency&quot;: 1,
         *           &quot;maxAttempt&quot;: 0,
         *           &quot;name&quot;: &quot;perf_auto_test_0&quot;,
         *           &quot;xattrs&quot;: &quot;&quot;,
         *           &quot;jobType&quot;: &quot;xxljob&quot;,
         *           &quot;contentType&quot;: 1,
         *           &quot;parameters&quot;: &quot;success-withMsg&quot;,
         *           &quot;timeConfig&quot;: {
         *             &quot;calendar&quot;: &quot;&quot;,
         *             &quot;dataOffset&quot;: 0,
         *             &quot;timeType&quot;: 1,
         *             &quot;paramMap&quot;: {},
         *             &quot;timeExpression&quot;: &quot;* * * * * ?&quot;
         *           },
         *           &quot;contactInfoList&quot;: [],
         *           &quot;status&quot;: 0
         *         }
         *       ]
         *     }
         *   ]
         * }</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>Determines whether to overwrite jobs if they already exist. The default is <strong>true</strong>.</p>
         * <ul>
         * <li><p><strong>true</strong>: Overwrites existing jobs.</p>
         * </li>
         * <li><p><strong>false</strong>: Does not overwrite existing jobs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder overwrite(Boolean overwrite) {
            this.putBodyParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        @Override
        public ImportJobsRequest build() {
            return new ImportJobsRequest(this);
        } 

    } 

}
