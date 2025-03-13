// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link DocumentInfo} extends {@link TeaModel}
 *
 * <p>DocumentInfo</p>
 */
public class DocumentInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("documentType")
    private String documentType;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("processStatus")
    private String processStatus;

    private DocumentInfo(Builder builder) {
        this.documentType = builder.documentType;
        this.id = builder.id;
        this.name = builder.name;
        this.processStatus = builder.processStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentInfo create() {
        return builder().build();
    }

    /**
     * @return documentType
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return processStatus
     */
    public String getProcessStatus() {
        return this.processStatus;
    }

    public static final class Builder {
        private String documentType; 
        private String id; 
        private String name; 
        private String processStatus; 

        /**
         * documentType.
         */
        public Builder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * processStatus.
         */
        public Builder processStatus(String processStatus) {
            this.processStatus = processStatus;
            return this;
        }

        public DocumentInfo build() {
            return new DocumentInfo(this);
        } 

    } 

}
