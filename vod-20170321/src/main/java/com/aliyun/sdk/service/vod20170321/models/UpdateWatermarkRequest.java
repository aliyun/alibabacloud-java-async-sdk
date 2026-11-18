// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link UpdateWatermarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateWatermarkRequest</p>
 */
public class UpdateWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String watermarkConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String watermarkId;

    private UpdateWatermarkRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.watermarkConfig = builder.watermarkConfig;
        this.watermarkId = builder.watermarkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWatermarkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return watermarkConfig
     */
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

    /**
     * @return watermarkId
     */
    public String getWatermarkId() {
        return this.watermarkId;
    }

    public static final class Builder extends Request.Builder<UpdateWatermarkRequest, Builder> {
        private String name; 
        private String watermarkConfig; 
        private String watermarkId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWatermarkRequest request) {
            super(request);
            this.name = request.name;
            this.watermarkConfig = request.watermarkConfig;
            this.watermarkId = request.watermarkId;
        } 

        /**
         * <p>The new name of the watermark template.</p>
         * <ul>
         * <li>Only Chinese characters, letters, and digits are supported.</li>
         * <li>The name can be up to 128 bytes in length.</li>
         * <li>UTF-8 encoding.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The configuration information of the image and text watermark (JSON character string), including the watermark display position and watermark effect. The configuration parameters for image watermarks and text watermarks are different. For details about the parameter structure, see <a href="~~98618#section-h01-44s-2lr~~">WatermarkConfig</a>.</p>
         * <blockquote>
         * <p>Modifying across templatetypes is not supported. You can invoke the <a href="~~GetWatermark~~">GetWatermark</a> operation to query the type of the watermark template before modifying the configuration.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Width&quot;:&quot;55&quot;,&quot;Height&quot;:&quot;55&quot;,&quot;Dx&quot;:&quot;9&quot;,&quot;Dy&quot;:&quot;9&quot;,&quot;ReferPos&quot;:&quot;BottomLeft&quot;}</p>
         */
        public Builder watermarkConfig(String watermarkConfig) {
            this.putQueryParameter("WatermarkConfig", watermarkConfig);
            this.watermarkConfig = watermarkConfig;
            return this;
        }

        /**
         * <p>The ID of the image and text watermark template to modify. Only a single watermark template ID is supported. You can obtain the ID by using one of the following methods:</p>
         * <ul>
         * <li>The ID is returned after you call the <a href="~~AddWatermark~~">AddWatermark</a> operation to add an image and text watermark template.</li>
         * <li>The ID is returned after you call the <a href="~~ListWatermark~~">ListWatermark</a> operation to query the list of image and text watermark templates.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af2afe4761992c*****bd947dae97337</p>
         */
        public Builder watermarkId(String watermarkId) {
            this.putQueryParameter("WatermarkId", watermarkId);
            this.watermarkId = watermarkId;
            return this;
        }

        @Override
        public UpdateWatermarkRequest build() {
            return new UpdateWatermarkRequest(this);
        } 

    } 

}
