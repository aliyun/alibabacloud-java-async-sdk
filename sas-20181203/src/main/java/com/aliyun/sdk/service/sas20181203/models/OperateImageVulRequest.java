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
 * {@link OperateImageVulRequest} extends {@link RequestModel}
 *
 * <p>OperateImageVulRequest</p>
 */
public class OperateImageVulRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Info")
    private String info;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private OperateImageVulRequest(Builder builder) {
        super(builder);
        this.info = builder.info;
        this.operateType = builder.operateType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateImageVulRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateImageVulRequest, Builder> {
        private String info; 
        private String operateType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateImageVulRequest request) {
            super(request);
            this.info = request.info;
            this.operateType = request.operateType;
            this.type = request.type;
        } 

        /**
         * <p>The information about the vulnerability. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li>namespace: the namespace of the image</li>
         * <li>repoName: the name of the Container Registry repository</li>
         * <li>regionId: the region ID</li>
         * <li>instanceId: the ID of the Container Registry instance</li>
         * <li>repoId: the name of the repository</li>
         * <li>tag: the tad added to the image</li>
         * <li>digest: the digest of the image</li>
         * <li>newTag: the tag added to the image after the vulnerability is fixed</li>
         * <li>uuid: the UUID of the image</li>
         * <li>ids: the IDs of the vulnerability primary keys</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;namespace&quot;:&quot;cloud_oa****&quot;,&quot;repoName&quot;:&quot;hybirdc****&quot;,&quot;regionId&quot;:&quot;cn-shanghai&quot;,&quot;instanceId&quot;:&quot;cri-rv4nvbv8iju4****&quot;,&quot;repoId&quot;:&quot;crr-2q7302qrofxg****&quot;,&quot;tag&quot;:&quot;hybird-cloud-web_fix_167115945****&quot;,&quot;digest&quot;:&quot;e1a4fd25884ca2ef8840bb252c9926e4f549df9e046500dd93539b2d458c****&quot;,&quot;newTag&quot;:&quot;hybird-cloud-web_fix_167115996****&quot;,&quot;uuid&quot;:&quot;4ad91dd8c0c02de6574fa98085d0****&quot;,&quot;ids&quot;:[197540864,197540865,197540869]}]</p>
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
        }

        /**
         * <p>If you want to fix the vulnerability, set the value to vul_fix.</p>
         * 
         * <strong>example:</strong>
         * <p>vul_fix</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The type of the vulnerability. Set the value to cve.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateImageVulRequest build() {
            return new OperateImageVulRequest(this);
        } 

    } 

}
