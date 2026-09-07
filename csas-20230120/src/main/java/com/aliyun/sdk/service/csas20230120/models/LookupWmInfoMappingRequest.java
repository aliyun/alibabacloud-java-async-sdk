// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link LookupWmInfoMappingRequest} extends {@link RequestModel}
 *
 * <p>LookupWmInfoMappingRequest</p>
 */
public class LookupWmInfoMappingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WmInfoSize")
    @com.aliyun.core.annotation.Validation(maximum = 64, minimum = 32)
    private Long wmInfoSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WmInfoUint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmInfoUint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmType;

    private LookupWmInfoMappingRequest(Builder builder) {
        super(builder);
        this.wmInfoSize = builder.wmInfoSize;
        this.wmInfoUint = builder.wmInfoUint;
        this.wmType = builder.wmType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupWmInfoMappingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return wmInfoSize
     */
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    /**
     * @return wmInfoUint
     */
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    /**
     * @return wmType
     */
    public String getWmType() {
        return this.wmType;
    }

    public static final class Builder extends Request.Builder<LookupWmInfoMappingRequest, Builder> {
        private Long wmInfoSize; 
        private String wmInfoUint; 
        private String wmType; 

        private Builder() {
            super();
        } 

        private Builder(LookupWmInfoMappingRequest request) {
            super(request);
            this.wmInfoSize = request.wmInfoSize;
            this.wmInfoUint = request.wmInfoUint;
            this.wmType = request.wmType;
        } 

        /**
         * <p>Bit width of the watermark information. Default value: 32. This parameter must match the bit width used when embedding or generating a transparent image. Valid values: 32 to 64. Use the same value as when you created the mapping. Otherwise, the mapping cannot be found.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder wmInfoSize(Long wmInfoSize) {
            this.putQueryParameter("WmInfoSize", wmInfoSize);
            this.wmInfoSize = wmInfoSize;
            return this;
        }

        /**
         * <p>Numeric-formatted watermark information. Value source:</p>
         * <ul>
         * <li><a href="~~CreateWmInfoMapping~~">CreateWmInfoMapping</a>: The <strong>WmInfoUint</strong> return value from the CreateWmInfoMapping API.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        public Builder wmInfoUint(String wmInfoUint) {
            this.putQueryParameter("WmInfoUint", wmInfoUint);
            this.wmInfoUint = wmInfoUint;
            return this;
        }

        /**
         * <p>Watermark type. Valid values:</p>
         * <ul>
         * <li><p><strong>PureWebappInvisible</strong>: Webpage watermark.</p>
         * </li>
         * <li><p><strong>PureAppInvisible</strong>: App watermark.</p>
         * </li>
         * <li><p><strong>PureScreenInvisible</strong>: Screen watermark.</p>
         * </li>
         * <li><p><strong>PureDocument</strong>: Document watermark.</p>
         * </li>
         * <li><p><strong>PureImage</strong>: Image watermark.</p>
         * </li>
         * <li><p><strong>PureAudio</strong>: Audio watermark.</p>
         * </li>
         * <li><p><strong>PureVideo</strong>: Video watermark.</p>
         * </li>
         * <li><p><strong>AigcWebappInvisible</strong>: AIGC webpage watermark.</p>
         * </li>
         * <li><p><strong>AigcAppInvisible</strong>: AIGC app watermark.</p>
         * </li>
         * <li><p><strong>AigcScreenInvisible</strong>: AIGC screen watermark.</p>
         * </li>
         * <li><p><strong>AigcDocument</strong>: AIGC document watermark.</p>
         * </li>
         * <li><p><strong>AigcImage</strong>: AIGC image watermark.</p>
         * </li>
         * <li><p><strong>AigcAudio</strong>: AIGC audio watermark.</p>
         * </li>
         * <li><p><strong>AigcVideo</strong>: AIGC video watermark.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PureDocument</p>
         */
        public Builder wmType(String wmType) {
            this.putQueryParameter("WmType", wmType);
            this.wmType = wmType;
            return this;
        }

        @Override
        public LookupWmInfoMappingRequest build() {
            return new LookupWmInfoMappingRequest(this);
        } 

    } 

}
