// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCoreWordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCoreWordResponseBody</p>
 */
public class DescribeCoreWordResponseBody extends TeaModel {
    @NameInMap("CoreWordCode")
    private String coreWordCode;

    @NameInMap("CoreWordName")
    private String coreWordName;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Synonyms")
    private java.util.List < String > synonyms;

    private DescribeCoreWordResponseBody(Builder builder) {
        this.coreWordCode = builder.coreWordCode;
        this.coreWordName = builder.coreWordName;
        this.createTime = builder.createTime;
        this.modifyTime = builder.modifyTime;
        this.requestId = builder.requestId;
        this.synonyms = builder.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCoreWordResponseBody create() {
        return builder().build();
    }

    /**
     * @return coreWordCode
     */
    public String getCoreWordCode() {
        return this.coreWordCode;
    }

    /**
     * @return coreWordName
     */
    public String getCoreWordName() {
        return this.coreWordName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return synonyms
     */
    public java.util.List < String > getSynonyms() {
        return this.synonyms;
    }

    public static final class Builder {
        private String coreWordCode; 
        private String coreWordName; 
        private String createTime; 
        private String modifyTime; 
        private String requestId; 
        private java.util.List < String > synonyms; 

        /**
         * CoreWordCode.
         */
        public Builder coreWordCode(String coreWordCode) {
            this.coreWordCode = coreWordCode;
            return this;
        }

        /**
         * CoreWordName.
         */
        public Builder coreWordName(String coreWordName) {
            this.coreWordName = coreWordName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Synonyms.
         */
        public Builder synonyms(java.util.List < String > synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        public DescribeCoreWordResponseBody build() {
            return new DescribeCoreWordResponseBody(this);
        } 

    } 

}
