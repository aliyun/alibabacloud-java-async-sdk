// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyGtmConfigRequest} extends {@link RequestModel}
 *
 * <p>CopyGtmConfigRequest</p>
 */
public class CopyGtmConfigRequest extends Request {
    @Query
    @NameInMap("CopyType")
    @Validation(required = true)
    private String copyType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceId")
    @Validation(required = true)
    private String sourceId;

    @Query
    @NameInMap("TargetId")
    @Validation(required = true)
    private String targetId;

    private CopyGtmConfigRequest(Builder builder) {
        super(builder);
        this.copyType = builder.copyType;
        this.lang = builder.lang;
        this.sourceId = builder.sourceId;
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyGtmConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return copyType
     */
    public String getCopyType() {
        return this.copyType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<CopyGtmConfigRequest, Builder> {
        private String copyType; 
        private String lang; 
        private String sourceId; 
        private String targetId; 

        private Builder() {
            super();
        } 

        private Builder(CopyGtmConfigRequest request) {
            super(request);
            this.copyType = request.copyType;
            this.lang = request.lang;
            this.sourceId = request.sourceId;
            this.targetId = request.targetId;
        } 

        /**
         * CopyType.
         */
        public Builder copyType(String copyType) {
            this.putQueryParameter("CopyType", copyType);
            this.copyType = copyType;
            return this;
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
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * TargetId.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public CopyGtmConfigRequest build() {
            return new CopyGtmConfigRequest(this);
        } 

    } 

}
