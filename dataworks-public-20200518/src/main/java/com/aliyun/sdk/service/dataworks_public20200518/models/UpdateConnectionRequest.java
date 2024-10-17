// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateConnectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateConnectionRequest</p>
 */
public class UpdateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private Integer envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateConnectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.connectionId = builder.connectionId;
        this.content = builder.content;
        this.description = builder.description;
        this.envType = builder.envType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnectionRequest create() {
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
     * @return connectionId
     */
    public Long getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateConnectionRequest, Builder> {
        private String regionId; 
        private Long connectionId; 
        private String content; 
        private String description; 
        private Integer envType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConnectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.connectionId = request.connectionId;
            this.content = request.content;
            this.description = request.description;
            this.envType = request.envType;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the region where your project resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The data source ID. You can call the <a href="https://help.aliyun.com/document_detail/173911.html">ListConnections</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder connectionId(Long connectionId) {
            this.putQueryParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * <p>The details of the data source. Examples of details of some common data sources:</p>
         * <ul>
         * <li>odps</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;accessId&quot;: &quot;xssssss&quot;,
         *   &quot;accessKey&quot;: &quot;xsaxsaxsa&quot;,
         *   &quot;authType&quot;: 2,
         *   &quot;endpoint&quot;: &quot;http://service.odps.aliyun.com/api&quot;,
         *   &quot;project&quot;: &quot;xsaxsax&quot;,
         *   &quot;tag&quot;: &quot;public&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>mysql</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;database&quot;: &quot;xsaxsa&quot;,
         *   &quot;instanceName&quot;: &quot;rm-xsaxsa&quot;,
         *   &quot;password&quot;: &quot;xsaxsa&quot;,
         *   &quot;rdsOwnerId&quot;: &quot;xasxsa&quot;,
         *   &quot;regionId&quot;: &quot;cn-shanghai&quot;,
         *   &quot;tag&quot;: &quot;rds&quot;,
         *   &quot;username&quot;: &quot;xsaxsa&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>rds</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;configType&quot;: 1,
         *   &quot;tag&quot;: &quot;rds&quot;,
         *   &quot;database&quot;: &quot;xsaxsa&quot;,
         *   &quot;username&quot;: &quot;xsaxsa&quot;,
         *   &quot;password&quot;: &quot;xssaxsa$32050&quot;,
         *   &quot;instanceName&quot;: &quot;rm-xsaxs&quot;,
         *   &quot;rdsOwnerId&quot;: &quot;11111111&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>oss</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;accessId&quot;: &quot;sssssxx&quot;,
         *   &quot;accessKey&quot;: &quot;xsaxaxsaxs&quot;,
         *   &quot;bucket&quot;: &quot;xsa-xs-xs&quot;,
         *   &quot;endpoint&quot;: &quot;http://oss-cn-shanghai.aliyuncs.com&quot;,
         *   &quot;tag&quot;: &quot;public&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>sqlserver</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;jdbcUrl&quot;: &quot;jdbc:sqlserver://xsaxsa-xsaxsa.database.xxx.cn:123;DatabaseName=xsxs-xsxs&quot;,
         *   &quot;password&quot;: &quot;sdasda$fs&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;username&quot;: &quot;sxaxacdacdd&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>polardb</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;clusterId&quot;: &quot;pc-sdadsadsa&quot;,
         *   &quot;database&quot;: &quot;dsadsadsa&quot;,
         *   &quot;ownerId&quot;: &quot;121212122&quot;,
         *   &quot;password&quot;: &quot;sdasdafssa&quot;,
         *   &quot;region&quot;: &quot;cn-shanghai&quot;,
         *   &quot;tag&quot;: &quot;polardb&quot;,
         *   &quot;username&quot;: &quot;asdadsads&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>oracle</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;jdbcUrl&quot;: &quot;jdbc:oracle:saaa:@xxxxx:1521:PROD&quot;,
         *   &quot;password&quot;: &quot;sxasaxsa&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;username&quot;: &quot;sasfadfa&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>mongodb</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;address&quot;: &quot;[\&quot;xsaxxsa.mongodb.rds.aliyuncs.com:3717\&quot;]&quot;,
         *   &quot;database&quot;: &quot;admin&quot;,
         *   &quot;password&quot;: &quot;sadsda@&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;username&quot;: &quot;dsadsadas&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>emr</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;accessId&quot;: &quot;xsaxsa&quot;,
         *   &quot;emrClusterId&quot;: &quot;C-dsads&quot;,
         *   &quot;emrResourceQueueName&quot;: &quot;default&quot;,
         *   &quot;emrEndpoint&quot;: &quot;emr.aliyuncs.com&quot;,
         *   &quot;accessKey&quot;: &quot;dsadsad&quot;,
         *   &quot;emrUserId&quot;: &quot;224833315798889783&quot;,
         *   &quot;name&quot;: &quot;sasdsadsa&quot;,
         *   &quot;emrAccessMode&quot;: &quot;simple&quot;,
         *   &quot;region&quot;: &quot;cn-shanghai&quot;,
         *   &quot;authType&quot;: &quot;2&quot;,
         *   &quot;emrProjectId&quot;: &quot;FP-sdadsad&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>postgresql</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;jdbcUrl&quot;: &quot;jdbc:postgresql://xxxx:1921/ssss&quot;,
         *   &quot;password&quot;: &quot;sdadsads&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;username&quot;: &quot;sdsasda&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>analyticdb_for_mysql</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;instanceId&quot;: &quot;am-sadsada&quot;,
         *   &quot;database&quot;: &quot;xsxsx&quot;,
         *   &quot;username&quot;: &quot;xsxsa&quot;,
         *   &quot;password&quot;: &quot;asdadsa&quot;,
         *   &quot;connectionString&quot;: &quot;am-xssxsxs.ads.aliyuncs.com:3306&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>hybriddb_for_postgresql</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;connectionString&quot;: &quot;gp-xsaxsaxa-master.gpdbmaster.rds.aliyuncs.com&quot;,
         *   &quot;database&quot;: &quot;xsaxsaxas&quot;,
         *   &quot;password&quot;: &quot;xsaxsaxsa@11&quot;,
         *   &quot;instanceId&quot;: &quot;gp-xsaxsaxsa&quot;,
         *   &quot;port&quot;: &quot;541132&quot;,
         *   &quot;ownerId&quot;: &quot;xsaxsaxsas&quot;,
         *   &quot;username&quot;: &quot;sadsad&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>holo</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;accessId&quot;: &quot;xsaxsaxs&quot;,
         *   &quot;accessKey&quot;: &quot;xsaxsaxsa&quot;,
         *   &quot;database&quot;: &quot;xsaxsaxsa&quot;,
         *   &quot;instanceId&quot;: &quot;xsaxa&quot;,
         *   &quot;tag&quot;: &quot;aliyun&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>kafka</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;instanceId&quot;: &quot;xsax-cn-xsaxsa&quot;,
         *   &quot;regionId&quot;: &quot;cn-shanghai&quot;,
         *   &quot;tag&quot;: &quot;aliyun&quot;,
         *   &quot;ownerId&quot;: &quot;1212121212112&quot;
         * }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{&quot;database&quot;:&quot;dbname&quot;,&quot;instanceName&quot;:&quot;instancename&quot;,&quot;password&quot;:&quot;password&quot;,&quot;rdsOwnerId&quot;:&quot;123&quot;,&quot;username&quot;:&quot;username&quot;}</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The environment in which the data source is used. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The status of the data source. Valid values: ENABLED and DISABLED. The value ENABLED indicates that the data source is in the normal state. The value DISABLED indicates that the data source is in an abnormal state.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateConnectionRequest build() {
            return new UpdateConnectionRequest(this);
        } 

    } 

}
