// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AIAssistantChatScope} extends {@link TeaModel}
 *
 * <p>AIAssistantChatScope</p>
 */
public class AIAssistantChatScope extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_ids")
    private java.util.List < String > driveIds;

    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List < CommonFileItem > files;

    private AIAssistantChatScope(Builder builder) {
        this.driveIds = builder.driveIds;
        this.files = builder.files;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAssistantChatScope create() {
        return builder().build();
    }

    /**
     * @return driveIds
     */
    public java.util.List < String > getDriveIds() {
        return this.driveIds;
    }

    /**
     * @return files
     */
    public java.util.List < CommonFileItem > getFiles() {
        return this.files;
    }

    public static final class Builder {
        private java.util.List < String > driveIds; 
        private java.util.List < CommonFileItem > files; 

        /**
         * drive_ids.
         */
        public Builder driveIds(java.util.List < String > driveIds) {
            this.driveIds = driveIds;
            return this;
        }

        /**
         * files.
         */
        public Builder files(java.util.List < CommonFileItem > files) {
            this.files = files;
            return this;
        }

        public AIAssistantChatScope build() {
            return new AIAssistantChatScope(this);
        } 

    } 

}
