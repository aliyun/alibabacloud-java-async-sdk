// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DocumentParseNarratorOption} extends {@link TeaModel}
 *
 * <p>DocumentParseNarratorOption</p>
 */
public class DocumentParseNarratorOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Narrate")
    private Boolean narrate;

    private DocumentParseNarratorOption(Builder builder) {
        this.narrate = builder.narrate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentParseNarratorOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return narrate
     */
    public Boolean getNarrate() {
        return this.narrate;
    }

    public static final class Builder {
        private Boolean narrate; 

        private Builder() {
        } 

        private Builder(DocumentParseNarratorOption model) {
            this.narrate = model.narrate;
        } 

        /**
         * Narrate.
         */
        public Builder narrate(Boolean narrate) {
            this.narrate = narrate;
            return this;
        }

        public DocumentParseNarratorOption build() {
            return new DocumentParseNarratorOption(this);
        } 

    } 

}
