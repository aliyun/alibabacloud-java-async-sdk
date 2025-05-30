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
 * {@link UpdateHotwordLibraryRequest} extends {@link RequestModel}
 *
 * <p>UpdateHotwordLibraryRequest</p>
 */
public class UpdateHotwordLibraryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotwordLibraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotwordLibraryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hotwords")
    private java.util.List<Hotword> hotwords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateHotwordLibraryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.hotwordLibraryId = builder.hotwordLibraryId;
        this.hotwords = builder.hotwords;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHotwordLibraryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hotwordLibraryId
     */
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

    /**
     * @return hotwords
     */
    public java.util.List<Hotword> getHotwords() {
        return this.hotwords;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateHotwordLibraryRequest, Builder> {
        private String description; 
        private String hotwordLibraryId; 
        private java.util.List<Hotword> hotwords; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHotwordLibraryRequest request) {
            super(request);
            this.description = request.description;
            this.hotwordLibraryId = request.hotwordLibraryId;
            this.hotwords = request.hotwords;
            this.name = request.name;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><em>a0052ff71efbfd4e7e6c66</em></p>
         */
        public Builder hotwordLibraryId(String hotwordLibraryId) {
            this.putQueryParameter("HotwordLibraryId", hotwordLibraryId);
            this.hotwordLibraryId = hotwordLibraryId;
            return this;
        }

        /**
         * Hotwords.
         */
        public Builder hotwords(java.util.List<Hotword> hotwords) {
            String hotwordsShrink = shrink(hotwords, "Hotwords", "json");
            this.putQueryParameter("Hotwords", hotwordsShrink);
            this.hotwords = hotwords;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateHotwordLibraryRequest build() {
            return new UpdateHotwordLibraryRequest(this);
        } 

    } 

}
