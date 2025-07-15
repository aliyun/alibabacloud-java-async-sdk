// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateMixStreamRequest} extends {@link RequestModel}
 *
 * <p>UpdateMixStreamRequest</p>
 */
public class UpdateMixStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputStreamList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputStreamList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    private String layoutId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MixStreamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mixStreamId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateMixStreamRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.inputStreamList = builder.inputStreamList;
        this.layoutId = builder.layoutId;
        this.mixStreamId = builder.mixStreamId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMixStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return inputStreamList
     */
    public String getInputStreamList() {
        return this.inputStreamList;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return mixStreamId
     */
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateMixStreamRequest, Builder> {
        private String domainName; 
        private String inputStreamList; 
        private String layoutId; 
        private String mixStreamId; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMixStreamRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.inputStreamList = request.inputStreamList;
            this.layoutId = request.layoutId;
            this.mixStreamId = request.mixStreamId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The main streaming domain.</p>
         * <blockquote>
         * <p> Only domain names that reside in the China (Shanghai) and China (Beijing) regions are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The input streams, in a JSON array.</p>
         * <p>For more information, see <strong>InputStreamConfig</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;InputStreamList&quot;:[{&quot;LayoutConfig&quot;:{&quot;fillSizeNormalized&quot;:[0.5,0.5],&quot;fillPositionNormalized&quot;:[0,0],&quot;positionRefer&quot;:&quot;topLeft&quot;,&quot;fillMode&quot;:&quot;fit&quot;},&quot;LayoutChildId&quot;:1,&quot;ResourceValue&quot;:&quot;rtmp://aliyundoc.com/caster/8564a8d1659b4dc69df5f66cf4c9****&quot;,&quot;ResourceType&quot;:&quot;live&quot;},{&quot;LayoutConfig&quot;:{&quot;fillSizeNormalized&quot;:[0.5,0.5],&quot;fillPositionNormalized&quot;:[0.5,0],&quot;positionRefer&quot;:&quot;topLeft&quot;,&quot;fillMode&quot;:&quot;fit&quot;},&quot;LayoutChildId&quot;:2,&quot;ResourceValue&quot;:&quot;<a href="http://developer.aliyundoc.com/3c3c25426cf744fdb90423e76b78a28a/69b1a16e2b1d423d9841bf27a96f134e-0b1cba51f58bb5ad3a854x96a2c735f****.mp4%22,%22ResourceType%22:%22url%22%7D,%7B%22LayoutConfig%22:%7B%22fillSizeNormalized%22:%5B1,0.5%5D,%22fillPositionNormalized%22:%5B0,0.5%5D,%22positionRefer%22:%22topLeft%22,%22fillMode%22:%22fit%22%7D,%22LayoutChildId%22:3,%22ResourceValue%22:%22http://aliyundoc.com/c0c6c5446b56432389e91535864938da/ed4adc5263b4474c954b95607a5350ae-fda757b3328438a8cf-4k57f373a0f0****.mp4%22,%22ResourceType%22:%22url%22%7D%5D%7D">http://developer.aliyundoc.com/3c3c25426cf744fdb90423e76b78a28a/69b1a16e2b1d423d9841bf27a96f134e-0b1cba51f58bb5ad3a854x96a2c735f****.mp4&quot;,&quot;ResourceType&quot;:&quot;url&quot;},{&quot;LayoutConfig&quot;:{&quot;fillSizeNormalized&quot;:[1,0.5],&quot;fillPositionNormalized&quot;:[0,0.5],&quot;positionRefer&quot;:&quot;topLeft&quot;,&quot;fillMode&quot;:&quot;fit&quot;},&quot;LayoutChildId&quot;:3,&quot;ResourceValue&quot;:&quot;http://aliyundoc.com/c0c6c5446b56432389e91535864938da/ed4adc5263b4474c954b95607a5350ae-fda757b3328438a8cf-4k57f373a0f0****.mp4&quot;,&quot;ResourceType&quot;:&quot;url&quot;}]}</a></p>
         */
        public Builder inputStreamList(String inputStreamList) {
            this.putQueryParameter("InputStreamList", inputStreamList);
            this.inputStreamList = inputStreamList;
            return this;
        }

        /**
         * <p>The ID of the layout. Valid values:</p>
         * <ul>
         * <li><strong>MixStreamLayout-1-1</strong></li>
         * <li><strong>MixStreamLayout-2-1</strong></li>
         * <li><strong>MixStreamLayout-2-2</strong></li>
         * <li><strong>MixStreamLayout-2-3</strong></li>
         * <li><strong>MixStreamLayout-3-1</strong></li>
         * <li><strong>MixStreamLayout-3-2</strong></li>
         * <li><strong>MixStreamLayout-4-1</strong></li>
         * <li><strong>USERDEFINED</strong>: If you do not use a preset layout, set this parameter to <strong>USERDEFINED</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> For more information, see <a href="https://help.aliyun.com/document_detail/199361.html">Preset layouts for stream mixing</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MixStreamLayout-3-2</p>
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * <p>The ID of the stream mixing task. If the task was created by calling the <a href="https://help.aliyun.com/document_detail/2848087.html">CreateMixStream</a> operation, check the value of the response parameter MixStreamId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5b2a046e-74d7-385e-d2d7-8a5b87e4****</p>
         */
        public Builder mixStreamId(String mixStreamId) {
            this.putQueryParameter("MixStreamId", mixStreamId);
            this.mixStreamId = mixStreamId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateMixStreamRequest build() {
            return new UpdateMixStreamRequest(this);
        } 

    } 

}
