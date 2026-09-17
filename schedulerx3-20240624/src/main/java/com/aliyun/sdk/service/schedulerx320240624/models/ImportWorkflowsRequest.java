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
 * {@link ImportWorkflowsRequest} extends {@link RequestModel}
 *
 * <p>ImportWorkflowsRequest</p>
 */
public class ImportWorkflowsRequest extends Request {
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

    private ImportWorkflowsRequest(Builder builder) {
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

    public static ImportWorkflowsRequest create() {
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

    public static final class Builder extends Request.Builder<ImportWorkflowsRequest, Builder> {
        private String regionId; 
        private Boolean autoCreateApp; 
        private String clusterId; 
        private String content; 
        private Boolean overwrite; 

        private Builder() {
            super();
        } 

        private Builder(ImportWorkflowsRequest request) {
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
         * <p>Specifies whether to automatically create the application if it does not exist.</p>
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
         * <p>The ID of the target cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-a1804a3226d</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The definitions of the workflows to import. The content must be a valid JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;kind&quot;:&quot;SchedulerXWorkflows&quot;,&quot;type&quot;:&quot;JSON&quot;,&quot;version&quot;:&quot;2.0&quot;,&quot;workflowInfo&quot;:{&quot;name&quot;:&quot;myWorkflow&quot;,&quot;description&quot;:&quot;&quot;,&quot;appName&quot;:&quot;xuerentest&quot;,&quot;appType&quot;:1,&quot;maxConcurrency&quot;:1,&quot;currentExecuteStatus&quot;:0,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;timeExpression&quot;:&quot;0 0 12 * * ?&quot;,&quot;dataOffset&quot;:0}},&quot;nodes&quot;:[{&quot;name&quot;:&quot;Java1&quot;,&quot;startTime&quot;:-1,&quot;coordinate&quot;:{&quot;x&quot;:-222.0,&quot;y&quot;:40.0,&quot;width&quot;:220.0,&quot;height&quot;:76.0},&quot;appName&quot;:&quot;xuerentest&quot;,&quot;description&quot;:&quot;&quot;,&quot;jobType&quot;:&quot;xxljob&quot;,&quot;executeMode&quot;:&quot;standalone&quot;,&quot;contentType&quot;:1,&quot;content&quot;:&quot;{\&quot;jobHandler\&quot;:\&quot;helloworld\&quot;}&quot;,&quot;xattrs&quot;:&quot;{\&quot;executorBlockStrategy\&quot;:1}&quot;,&quot;dependentStrategy&quot;:1,&quot;routeStrategy&quot;:1,&quot;parameters&quot;:&quot;&quot;,&quot;maxConcurrency&quot;:1,&quot;maxAttempt&quot;:0,&quot;attemptInterval&quot;:30,&quot;priority&quot;:5,&quot;weight&quot;:1,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;calendar&quot;:&quot;&quot;,&quot;dataOffset&quot;:0},&quot;monitorConfigInfo&quot;:{&quot;timeoutEnable&quot;:true,&quot;failEnable&quot;:true,&quot;failLimitTimes&quot;:1,&quot;failRate&quot;:100,&quot;missWorkerEnable&quot;:true,&quot;timeout&quot;:300,&quot;timeoutKillEnable&quot;:false,&quot;daysOfDeadline&quot;:0,&quot;sendChannel&quot;:&quot;&quot;,&quot;alarmType&quot;:&quot;CustomContacts&quot;,&quot;successNotice&quot;:false,&quot;endEarlyEnable&quot;:false,&quot;endEarly&quot;:30},&quot;contactInfoList&quot;:[]},{&quot;name&quot;:&quot;shell1&quot;,&quot;startTime&quot;:-1,&quot;coordinate&quot;:{&quot;x&quot;:102.0,&quot;y&quot;:-51.0,&quot;width&quot;:220.0,&quot;height&quot;:76.0},&quot;appName&quot;:&quot;xuerentest&quot;,&quot;description&quot;:&quot;&quot;,&quot;jobType&quot;:&quot;script_shell&quot;,&quot;executeMode&quot;:&quot;standalone&quot;,&quot;contentType&quot;:2,&quot;content&quot;:&quot;echo \&quot;hello world\&quot;&quot;,&quot;xattrs&quot;:&quot;{\&quot;executorBlockStrategy\&quot;:1}&quot;,&quot;dependentStrategy&quot;:1,&quot;routeStrategy&quot;:1,&quot;parameters&quot;:&quot;&quot;,&quot;maxConcurrency&quot;:1,&quot;maxAttempt&quot;:0,&quot;attemptInterval&quot;:30,&quot;priority&quot;:5,&quot;weight&quot;:1,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;calendar&quot;:&quot;&quot;,&quot;dataOffset&quot;:0},&quot;monitorConfigInfo&quot;:{&quot;timeoutEnable&quot;:true,&quot;failEnable&quot;:true,&quot;failLimitTimes&quot;:1,&quot;failRate&quot;:100,&quot;missWorkerEnable&quot;:true,&quot;timeout&quot;:300,&quot;timeoutKillEnable&quot;:false,&quot;daysOfDeadline&quot;:0,&quot;sendChannel&quot;:&quot;&quot;,&quot;alarmType&quot;:&quot;CustomContacts&quot;,&quot;successNotice&quot;:false,&quot;endEarlyEnable&quot;:false,&quot;endEarly&quot;:30},&quot;contactInfoList&quot;:[]},{&quot;name&quot;:&quot;Java2&quot;,&quot;startTime&quot;:-1,&quot;coordinate&quot;:{&quot;x&quot;:390.0,&quot;y&quot;:55.0,&quot;width&quot;:220.0,&quot;height&quot;:76.0},&quot;appName&quot;:&quot;xuerentest&quot;,&quot;description&quot;:&quot;&quot;,&quot;jobType&quot;:&quot;xxljob&quot;,&quot;executeMode&quot;:&quot;standalone&quot;,&quot;contentType&quot;:1,&quot;content&quot;:&quot;{\&quot;jobHandler\&quot;:\&quot;helloworld2\&quot;}&quot;,&quot;xattrs&quot;:&quot;{\&quot;executorBlockStrategy\&quot;:1,\&quot;localParams\&quot;:[]}&quot;,&quot;dependentStrategy&quot;:1,&quot;routeStrategy&quot;:1,&quot;parameters&quot;:&quot;&quot;,&quot;maxConcurrency&quot;:1,&quot;maxAttempt&quot;:0,&quot;attemptInterval&quot;:30,&quot;priority&quot;:5,&quot;weight&quot;:1,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;calendar&quot;:&quot;&quot;,&quot;dataOffset&quot;:0},&quot;monitorConfigInfo&quot;:{&quot;timeoutEnable&quot;:true,&quot;failEnable&quot;:true,&quot;failLimitTimes&quot;:1,&quot;failRate&quot;:100,&quot;missWorkerEnable&quot;:true,&quot;timeout&quot;:300,&quot;timeoutKillEnable&quot;:false,&quot;daysOfDeadline&quot;:0,&quot;sendChannel&quot;:&quot;&quot;,&quot;alarmType&quot;:&quot;CustomContacts&quot;,&quot;successNotice&quot;:false,&quot;endEarlyEnable&quot;:false,&quot;endEarly&quot;:30},&quot;contactInfoList&quot;:[]},{&quot;name&quot;:&quot;shell2&quot;,&quot;startTime&quot;:-1,&quot;coordinate&quot;:{&quot;x&quot;:89.0,&quot;y&quot;:161.0,&quot;width&quot;:220.0,&quot;height&quot;:76.0},&quot;appName&quot;:&quot;xuerentest&quot;,&quot;description&quot;:&quot;&quot;,&quot;jobType&quot;:&quot;script_shell&quot;,&quot;executeMode&quot;:&quot;standalone&quot;,&quot;contentType&quot;:2,&quot;content&quot;:&quot;echo \&quot;hello world2\&quot;&quot;,&quot;xattrs&quot;:&quot;{\&quot;executorBlockStrategy\&quot;:1}&quot;,&quot;dependentStrategy&quot;:1,&quot;routeStrategy&quot;:1,&quot;parameters&quot;:&quot;&quot;,&quot;maxConcurrency&quot;:1,&quot;maxAttempt&quot;:0,&quot;attemptInterval&quot;:30,&quot;priority&quot;:5,&quot;weight&quot;:1,&quot;timeConfig&quot;:{&quot;timeType&quot;:1,&quot;calendar&quot;:&quot;&quot;,&quot;dataOffset&quot;:0},&quot;monitorConfigInfo&quot;:{&quot;timeoutEnable&quot;:true,&quot;failEnable&quot;:true,&quot;failLimitTimes&quot;:1,&quot;failRate&quot;:100,&quot;missWorkerEnable&quot;:true,&quot;timeout&quot;:300,&quot;timeoutKillEnable&quot;:false,&quot;daysOfDeadline&quot;:0,&quot;sendChannel&quot;:&quot;&quot;,&quot;alarmType&quot;:&quot;CustomContacts&quot;,&quot;successNotice&quot;:false,&quot;endEarlyEnable&quot;:false,&quot;endEarly&quot;:30},&quot;contactInfoList&quot;:[]}],&quot;edges&quot;:[{&quot;from&quot;:&quot;Java1&quot;,&quot;to&quot;:&quot;shell1&quot;},{&quot;from&quot;:&quot;Java1&quot;,&quot;to&quot;:&quot;shell2&quot;},{&quot;from&quot;:&quot;Schedulerx-Root&quot;,&quot;to&quot;:&quot;Java1&quot;},{&quot;from&quot;:&quot;shell1&quot;,&quot;to&quot;:&quot;Java2&quot;},{&quot;from&quot;:&quot;shell2&quot;,&quot;to&quot;:&quot;Java2&quot;}]}]</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite an existing workflow that has the same name. Default value: <code>true</code>.</p>
         * <ul>
         * <li><p><code>true</code>: The existing workflow is overwritten.</p>
         * </li>
         * <li><p><code>false</code>: The existing workflow is not overwritten.</p>
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
        public ImportWorkflowsRequest build() {
            return new ImportWorkflowsRequest(this);
        } 

    } 

}
