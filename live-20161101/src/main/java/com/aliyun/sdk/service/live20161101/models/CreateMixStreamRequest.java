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
 * {@link CreateMixStreamRequest} extends {@link RequestModel}
 *
 * <p>CreateMixStreamRequest</p>
 */
public class CreateMixStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackConfig")
    private String callbackConfig;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String layoutId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateMixStreamRequest(Builder builder) {
        super(builder);
        this.callbackConfig = builder.callbackConfig;
        this.domainName = builder.domainName;
        this.inputStreamList = builder.inputStreamList;
        this.layoutId = builder.layoutId;
        this.outputConfig = builder.outputConfig;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMixStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackConfig
     */
    public String getCallbackConfig() {
        return this.callbackConfig;
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
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
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

    public static final class Builder extends Request.Builder<CreateMixStreamRequest, Builder> {
        private String callbackConfig; 
        private String domainName; 
        private String inputStreamList; 
        private String layoutId; 
        private String outputConfig; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMixStreamRequest request) {
            super(request);
            this.callbackConfig = request.callbackConfig;
            this.domainName = request.domainName;
            this.inputStreamList = request.inputStreamList;
            this.layoutId = request.layoutId;
            this.outputConfig = request.outputConfig;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The callback URL. The value is a JSON array. If a callback event is triggered, ApsaraVideo Live sends an HTTP POST request to the URL. The content is included in the HTTP request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CallbackUrl&quot;:&quot;<a href="http://aliyundoc.com%22%7D">http://aliyundoc.com&quot;}</a></p>
         */
        public Builder callbackConfig(String callbackConfig) {
            this.putQueryParameter("CallbackConfig", callbackConfig);
            this.callbackConfig = callbackConfig;
            return this;
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
         * <p>The input streams. The value is a JSON array.</p>
         * <p>For more information, see <strong>InputStreamConfig</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;LayoutChildId&quot;:1,&quot;ResourceType&quot;:&quot;live&quot;,&quot;ResourceValue&quot;:&quot;rtmp://example.net/live/f2139ec2b8d6a191068cd<strong><strong>ea9064d?auth_key=1600947017-0-0-0b5645fe35d21a65ab92b394bd4d</strong></strong>&quot;,&quot;LayoutConfig&quot;:{&quot;FillMode&quot;:&quot;fit&quot;,&quot;PositionRefer&quot;:&quot;topLeft&quot;,&quot;FillPositionNormalized&quot;:[0,0],&quot;FillSizeNormalized&quot;:[1,1]}}]</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MixStreamLayout-1-1</p>
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * <p>The configuration of the output stream. The value is a JSON string.</p>
         * <p>For more information, see <strong>OutputConfig</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AppName&quot;:&quot;liveApp****&quot;,&quot;StreamName&quot;:&quot;9a78fb3f5c508be0122746f677a3****&quot;,&quot;MixStreamTemplate&quot;:&quot;lp_hd_v&quot;,&quot;ExpireDuration&quot;:&quot;86400&quot;}</p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
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
        public CreateMixStreamRequest build() {
            return new CreateMixStreamRequest(this);
        } 

    } 

}
