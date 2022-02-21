// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJournalProofResponseBody} extends {@link TeaModel}
 *
 * <p>GetJournalProofResponseBody</p>
 */
public class GetJournalProofResponseBody extends TeaModel {
    @NameInMap("JournalSequence")
    private Long journalSequence;

    @NameInMap("LedgerId")
    private String ledgerId;

    @NameInMap("ProofPath")
    private String proofPath;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RootHash")
    private String rootHash;

    @NameInMap("WriterPubKey")
    private String writerPubKey;

    private GetJournalProofResponseBody(Builder builder) {
        this.journalSequence = builder.journalSequence;
        this.ledgerId = builder.ledgerId;
        this.proofPath = builder.proofPath;
        this.requestId = builder.requestId;
        this.rootHash = builder.rootHash;
        this.writerPubKey = builder.writerPubKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJournalProofResponseBody create() {
        return builder().build();
    }

    /**
     * @return journalSequence
     */
    public Long getJournalSequence() {
        return this.journalSequence;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    /**
     * @return proofPath
     */
    public String getProofPath() {
        return this.proofPath;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootHash
     */
    public String getRootHash() {
        return this.rootHash;
    }

    /**
     * @return writerPubKey
     */
    public String getWriterPubKey() {
        return this.writerPubKey;
    }

    public static final class Builder {
        private Long journalSequence; 
        private String ledgerId; 
        private String proofPath; 
        private String requestId; 
        private String rootHash; 
        private String writerPubKey; 

        /**
         * JournalSequence.
         */
        public Builder journalSequence(Long journalSequence) {
            this.journalSequence = journalSequence;
            return this;
        }

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }

        /**
         * ProofPath.
         */
        public Builder proofPath(String proofPath) {
            this.proofPath = proofPath;
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
         * RootHash.
         */
        public Builder rootHash(String rootHash) {
            this.rootHash = rootHash;
            return this;
        }

        /**
         * WriterPubKey.
         */
        public Builder writerPubKey(String writerPubKey) {
            this.writerPubKey = writerPubKey;
            return this;
        }

        public GetJournalProofResponseBody build() {
            return new GetJournalProofResponseBody(this);
        } 

    } 

}
