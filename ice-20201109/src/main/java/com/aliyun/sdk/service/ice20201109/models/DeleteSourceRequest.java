// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteSourceRequest</p>
 */
public class DeleteSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftDelete")
    private Boolean softDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLocationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    private DeleteSourceRequest(Builder builder) {
        super(builder);
        this.softDelete = builder.softDelete;
        this.sourceLocationName = builder.sourceLocationName;
        this.sourceName = builder.sourceName;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return softDelete
     */
    public Boolean getSoftDelete() {
        return this.softDelete;
    }

    /**
     * @return sourceLocationName
     */
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * @return sourceName
     */
    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<DeleteSourceRequest, Builder> {
        private Boolean softDelete; 
        private String sourceLocationName; 
        private String sourceName; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSourceRequest request) {
            super(request);
            this.softDelete = request.softDelete;
            this.sourceLocationName = request.sourceLocationName;
            this.sourceName = request.sourceName;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>Specifies whether to use delete markers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder softDelete(Boolean softDelete) {
            this.putQueryParameter("SoftDelete", softDelete);
            this.softDelete = softDelete;
            return this;
        }

        /**
         * <p>The name of the source location.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLocation</p>
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.putQueryParameter("SourceLocationName", sourceLocationName);
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        /**
         * <p>The name of the source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyVodSource</p>
         */
        public Builder sourceName(String sourceName) {
            this.putQueryParameter("SourceName", sourceName);
            this.sourceName = sourceName;
            return this;
        }

        /**
         * <p>The source type. Valid values: vodSource and liveSource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vodSource</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public DeleteSourceRequest build() {
            return new DeleteSourceRequest(this);
        } 

    } 

}
