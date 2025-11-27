// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DescribeWuyingServerEipInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeWuyingServerEipInfoRequest</p>
 */
public class DescribeWuyingServerEipInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wuyingServerId;

    private DescribeWuyingServerEipInfoRequest(Builder builder) {
        super(builder);
        this.isp = builder.isp;
        this.wuyingServerId = builder.wuyingServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWuyingServerEipInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return wuyingServerId
     */
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    public static final class Builder extends Request.Builder<DescribeWuyingServerEipInfoRequest, Builder> {
        private String isp; 
        private String wuyingServerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWuyingServerEipInfoRequest request) {
            super(request);
            this.isp = request.isp;
            this.wuyingServerId = request.wuyingServerId;
        } 

        /**
         * <p>The Internet service provider (ISP). Valid values:</p>
         * <ul>
         * <li>ChinaMobile: China Mobile</li>
         * <li>ChinaTelecom: China Telecom</li>
         * <li>ChinaUnicom: China Unicom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ChinaTelecom</p>
         */
        public Builder isp(String isp) {
            this.putBodyParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The ID of the workstation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0bw2f11****dial</p>
         */
        public Builder wuyingServerId(String wuyingServerId) {
            this.putBodyParameter("WuyingServerId", wuyingServerId);
            this.wuyingServerId = wuyingServerId;
            return this;
        }

        @Override
        public DescribeWuyingServerEipInfoRequest build() {
            return new DescribeWuyingServerEipInfoRequest(this);
        } 

    } 

}
