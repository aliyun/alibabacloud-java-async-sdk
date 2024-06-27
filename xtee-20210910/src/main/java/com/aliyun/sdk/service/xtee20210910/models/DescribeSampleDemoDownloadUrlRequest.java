// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSampleDemoDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeSampleDemoDownloadUrlRequest</p>
 */
public class DescribeSampleDemoDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    private DescribeSampleDemoDownloadUrlRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleDemoDownloadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<DescribeSampleDemoDownloadUrlRequest, Builder> {
        private String lang; 
        private String regId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSampleDemoDownloadUrlRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.scene = request.scene;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public DescribeSampleDemoDownloadUrlRequest build() {
            return new DescribeSampleDemoDownloadUrlRequest(this);
        } 

    } 

}
