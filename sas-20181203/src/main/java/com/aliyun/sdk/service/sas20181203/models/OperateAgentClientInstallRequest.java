// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OperateAgentClientInstallRequest} extends {@link RequestModel}
 *
 * <p>OperateAgentClientInstallRequest</p>
 */
public class OperateAgentClientInstallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private OperateAgentClientInstallRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.lang = builder.lang;
        this.os = builder.os;
        this.region = builder.region;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAgentClientInstallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<OperateAgentClientInstallRequest, Builder> {
        private String instanceIds; 
        private String lang; 
        private String os; 
        private String region; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(OperateAgentClientInstallRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.lang = request.lang;
            this.os = request.os;
            this.region = request.region;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The IDs of the servers on which you want to install the Security Center agent. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p>: You must specify at least one of <strong>InstanceIds</strong> and <strong>Uuids</strong>. If you specify <strong>InstanceIds</strong>, you must also specify <strong>Region</strong> and <strong>Os</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-uf6j8vq9l4r5ntht****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The operating system of the servers. Valid values:</p>
         * <ul>
         * <li><strong>linux</strong></li>
         * <li><strong>windows</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>The region where the servers reside. Valid values include the following regions:</p>
         * <ul>
         * <li>cn-hangzhou: China (Hangzhou)</li>
         * <li>cn-beijing: China (Beijing)</li>
         * <li>cn-shanghai: China (Shanghai)</li>
         * <li>cn-zhangjiakou: China (Zhangjiakou)</li>
         * <li>cn-shenzhen: China (Shenzhen)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The UUIDs of the servers on which you want to install the Security Center agent. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p>You must specify at least one of the <strong>InstanceIds</strong> and <strong>Uuids</strong> parameters before you can call this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1587bedb-fdb4-48c4-9330-************</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public OperateAgentClientInstallRequest build() {
            return new OperateAgentClientInstallRequest(this);
        } 

    } 

}
