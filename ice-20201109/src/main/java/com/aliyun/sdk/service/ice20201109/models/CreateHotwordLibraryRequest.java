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
 * {@link CreateHotwordLibraryRequest} extends {@link RequestModel}
 *
 * <p>CreateHotwordLibraryRequest</p>
 */
public class CreateHotwordLibraryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hotwords")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Hotword> hotwords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsageScenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private String usageScenario;

    private CreateHotwordLibraryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.hotwords = builder.hotwords;
        this.name = builder.name;
        this.usageScenario = builder.usageScenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHotwordLibraryRequest create() {
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

    /**
     * @return usageScenario
     */
    public String getUsageScenario() {
        return this.usageScenario;
    }

    public static final class Builder extends Request.Builder<CreateHotwordLibraryRequest, Builder> {
        private String description; 
        private java.util.List<Hotword> hotwords; 
        private String name; 
        private String usageScenario; 

        private Builder() {
            super();
        } 

        private Builder(CreateHotwordLibraryRequest request) {
            super(request);
            this.description = request.description;
            this.hotwords = request.hotwords;
            this.name = request.name;
            this.usageScenario = request.usageScenario;
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
         */
        public Builder hotwords(java.util.List<Hotword> hotwords) {
            String hotwordsShrink = shrink(hotwords, "Hotwords", "json");
            this.putQueryParameter("Hotwords", hotwordsShrink);
            this.hotwords = hotwords;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_hotwords</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASR</p>
         */
        public Builder usageScenario(String usageScenario) {
            this.putQueryParameter("UsageScenario", usageScenario);
            this.usageScenario = usageScenario;
            return this;
        }

        @Override
        public CreateHotwordLibraryRequest build() {
            return new CreateHotwordLibraryRequest(this);
        } 

    } 

}
