// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateAgentClientInstallRequest} extends {@link RequestModel}
 *
 * <p>OperateAgentClientInstallRequest</p>
 */
public class OperateAgentClientInstallRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Os")
    private String os;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Uuids")
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
         * The IDs of the servers on which you want to install the Security Center agent. Separate multiple IDs with commas (,).
         * <p>
         * 
         * > : You must specify at least one of **InstanceIds** and **Uuids**. If you specify **InstanceIds**, you must also specify **Region** and **Os**.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The operating system of the servers. Valid values:
         * <p>
         * 
         * *   **linux**
         * *   **windows**
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * The region where the servers reside. Valid values include the following regions:
         * <p>
         * 
         * *   cn-hangzhou: China (Hangzhou)
         * *   cn-beijing: China (Beijing)
         * *   cn-shanghai: China (Shanghai)
         * *   cn-zhangjiakou: China (Zhangjiakou)
         * *   cn-shenzhen: China (Shenzhen)
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The UUIDs of the servers on which you want to install the Security Center agent. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * > You must specify at least one of the **InstanceIds** and **Uuids** parameters before you can call this operation.
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
